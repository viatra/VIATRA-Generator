package org.eclipse.viatra.coding;

import java.util.*;
import java.util.stream.Collectors;

public final class Utils {
    public static final Comparator<List<Integer>> edgeComparator = (o1, o2) -> !o1.get(0).equals(o2.get(0)) ? o1.get(0) - o2.get(0) : o1.get(1) - o2.get(1);

    /**
     * get adjacency matrix of the graph, currently only work for graphs with one edge label. O(E)
     * @param graph: graph with one edge label
     * @param nodeOrdering: node ordering for ordering the adjacency matrix, node not in the graph will just having
     *                      false entries to any other node (including itself)
     * @return The adjacency matrix of the graph for the specific node ordering
     */
    public static boolean[][] adjacencyMatrix(Graph graph, List<Node> nodeOrdering) {
        if (graph.getLabelEdges().keySet().size() != 1) {
            throw  new IllegalArgumentException("There must be exactly one edge label to calculate the adjacency matrix!");
        }

        boolean[][] adjacency = new boolean[nodeOrdering.size()][nodeOrdering.size()];
        Set<List<Node>> edges = graph.getLabelEdges().get(graph.getEdgeLabels().get(0));
        Map<Node, Integer> nodeToIndex = new HashMap<>();
        for (int i = 0; i < nodeOrdering.size(); i++) {
            nodeToIndex.put(nodeOrdering.get(i), i);
        }

        try {
            for (List<Node> edge : edges) {
                adjacency[nodeToIndex.get(edge.get(0))][nodeToIndex.get(edge.get(1))] = true;
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("The node ordering does not contain all nodes of the graph", e);
        }

        return adjacency;
    }

    public static SortedMap<String, List<List<Integer>>> adjacencyMap(Graph graph, List<Node> nodeOrdering) {
        Map<Node, Integer> nodeToIndex = new HashMap<>();
        SortedMap<String, List<List<Integer>>> adjacencyMap = new TreeMap<>();

        for (int i = 0; i < nodeOrdering.size(); i++) {
            nodeToIndex.put(nodeOrdering.get(i), i);
        }

        List<String> edgeLabels = graph.getEdgeLabels();
        for (String label : edgeLabels) {
            List<List<Integer>> sortedEdges = graph.getLabelEdges().get(label).stream()
                    .map(edge -> Arrays.asList(nodeToIndex.get(edge.get(0)), nodeToIndex.get(edge.get(1))))
                    .sorted(edgeComparator).collect(Collectors.toList());
            adjacencyMap.put(label, sortedEdges);
        }

        return adjacencyMap;
    }

}
