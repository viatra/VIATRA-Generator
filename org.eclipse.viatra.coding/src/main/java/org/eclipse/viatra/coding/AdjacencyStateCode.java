package org.eclipse.viatra.coding;

import java.util.*;

public class AdjacencyStateCode implements IStateCode {
    private int shuffleTime;
    private List<Integer> sortedNodeCodes;

    private static final Comparator<List<List<Integer>>> adjacencyListComparator = (o1, o2) -> {
        for (int i = 0; i < o1.size() && i < o2.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if (!o1.get(i).get(j).equals(o2.get(i).get(j))) {
                    return o1.get(i).get(j) - o2.get(i).get(j);
                }
            }
        }
        return o1.size() - o2.size();
    };

    private static final Comparator<Map<String, List<List<Integer>>>> adjacencyMapComparator = (m1, m2) -> {
        Iterator<Map.Entry<String, List<List<Integer>>>> i1 = m1.entrySet().iterator();
        Iterator<Map.Entry<String, List<List<Integer>>>> i2 = m2.entrySet().iterator();

        while(i1.hasNext() && i2.hasNext()) {
            Map.Entry<String, List<List<Integer>>> e1 = i1.next();
            Map.Entry<String, List<List<Integer>>> e2 = i2.next();

            int keyCompare = e1.getKey().compareTo(e2.getKey());
            if (keyCompare != 0) {
                return keyCompare;
            }

            int valueCompare = adjacencyListComparator.compare(e1.getValue(), e2.getValue());
            if (valueCompare != 0) {
                return valueCompare;
            }
        }

        return m1.size() - m2.size();
    };

    public AdjacencyStateCode(int shuffleTime) {
        this.shuffleTime = shuffleTime;
    }

    @Override
    public Object processStateCode(Graph graph, Map<Node, Integer> nodeCerts) {
        Map<Integer, List<Node>> nodeGrouping = createNodeGrouping(nodeCerts);

        List<Integer> sortedNodeCodes = new ArrayList<>(nodeGrouping.keySet());
        Collections.sort(sortedNodeCodes);

        SortedMap<String, List<List<Integer>>> adjacencyMap = null;


        for (int i = 0; i < shuffleTime; i++) {
            List<Node> nodeOrdering = shuffleNodes(nodeGrouping, sortedNodeCodes);

            SortedMap<String, List<List<Integer>>> newAdjacencyMap = Utils.adjacencyMap(graph, nodeOrdering);
            adjacencyMap = (adjacencyMap == null)? newAdjacencyMap : (adjacencyMapComparator.compare(adjacencyMap, newAdjacencyMap) > 0) ? newAdjacencyMap : adjacencyMap;
        }

        assert adjacencyMap != null;
        return adjacencyMatrixHash(adjacencyMap);
    }

    public int adjacencyMatrixHash(SortedMap<String, List<List<Integer>>> adjacencyMap) {
        int code = 0;
        for (Map.Entry<String, List<List<Integer>>> stringListEntry : adjacencyMap.entrySet()) {
            code = code * 31 + encodeEntry(stringListEntry);
        }

        return code;
    }

    private int encodeEntry(Map.Entry<String, List<List<Integer>>> e) {
        return e.getKey().hashCode() * 31 + e.getValue().hashCode();
    }

    private Map<Node, Map<Node, String>> processGraph(Graph graph) {
        Map<Node, Map<Node, String>> mapGraph = new HashMap<>();
        List<String> sortedEdgeLabel = graph.getEdgeLabels();
        Collections.sort(sortedEdgeLabel);

        for (int i = 0; i < sortedEdgeLabel.size(); i++) {
            String label = sortedEdgeLabel.get(i);
            for (List<Node> edge : graph.getLabelEdges().get(label)) {
                if (!mapGraph.containsKey(edge.get(0))) {
                    mapGraph.put(edge.get(0), new HashMap<>());
                }

                Map<Node, String> neighbors = mapGraph.get(edge.get(0));
                neighbors.put(edge.get(1), neighbors.getOrDefault(edge.get(1), "") + Integer.toString(i));
            }
        }

        return mapGraph;
    }

    private Map<Integer, List<Node>> createNodeGrouping(Map<Node, Integer> nodeCerts) {
        Map<Integer, List<Node>> grouping = new HashMap<>();
        for (Map.Entry<Node, Integer> entry : nodeCerts.entrySet()) {
            if (!grouping.containsKey(entry.getValue())) {
                grouping.put(entry.getValue(), new ArrayList<>());
            }

            grouping.get(entry.getValue()).add(entry.getKey());
        }

        return grouping;
    }

    private String adjacencyString(Map<Node, Map<Node, String>> mapGraph, List<Node> nodeOrdering) {
        StringBuilder sb = new StringBuilder();
        for (Node start : nodeOrdering) {
            // node has no outgoing edges
            if (!mapGraph.containsKey(start)) {
                for (int i = 0; i < nodeOrdering.size(); i++) {
                    sb.append("-");
                }
            }else {
                Map<Node, String> neighbors = mapGraph.get(start);
                for (Node end : nodeOrdering) {
                    sb.append(neighbors.getOrDefault(end, "-"));
                }
            }
        }

        return sb.toString();
    }

    private List<Node> shuffleNodes(Map<Integer, List<Node>> nodeGrouping, List<Integer> sortedNodeCodes) {
        List<Node> result = new ArrayList<>();
        for (Integer code : sortedNodeCodes) {
            List<Node> nodes = nodeGrouping.get(code);
            Collections.shuffle(nodes);
            result.addAll(nodes);
        }

        return result;
    }
}
