package org.eclipse.viatra.coding;

import java.util.*;

public class Graph{
    private Map<String, Set<List<Node>>> labelEdges;
    private Map<String, Set<Node>> labelNodes;
    private List<Node> nodeOrdering;

    public Graph(List<String> nodeLabels, List<String> edgeLabels) {
        labelNodes = new HashMap<>();
        labelEdges = new HashMap<>();
        for (String nodeLabel : nodeLabels) {
            labelNodes.put(nodeLabel, new HashSet<>());
        }

        for (String edgeLabel : edgeLabels) {
            labelEdges.put(edgeLabel, new HashSet<>());
        }
        nodeOrdering = new ArrayList<>();
    }

    // clone a graph
    public Graph(Graph other) {
        labelNodes = new HashMap<>();
        labelEdges = new HashMap<>();
        for (Map.Entry<String, Set<Node>> entry : other.labelNodes.entrySet()) {
            labelNodes.put(entry.getKey(), new HashSet<>(entry.getValue()));
        }

        for (Map.Entry<String, Set<List<Node>>> entry : other.labelEdges.entrySet()) {
            Set<List<Node>> value = new HashSet<>();
            for (List<Node> edge : entry.getValue()) {
                value.add(new ArrayList<>(edge));
            }

            labelEdges.put(entry.getKey(), value);
        }

        nodeOrdering = new ArrayList<>(other.nodeOrdering);
    }

    public void addNode(Node node, String label) {
        if (labelNodes.containsKey(label)) {
            labelNodes.get(label).add(node);
            nodeOrdering.add(node);
        }
    }

    public void addEdge(Node src, Node tgt, String label) {
        if (nodeOrdering.contains(src) && nodeOrdering.contains(tgt) && labelEdges.containsKey(label)) {
            labelEdges.get(label).add(Arrays.asList(src, tgt));
        }
    }

    public void removeEdge(Node src, Node tgt, String label) {
        if (!labelEdges.containsKey(label)) {
            return;
        }

        labelEdges.get(label).remove(Arrays.asList(src, tgt));
    }

    public Map<String, Set<List<Node>>> getLabelEdges() {
        return labelEdges;
    }

    public List<String> getEdgeLabels() {
        return new ArrayList<>(labelEdges.keySet());
    }

    public Map<String, Set<Node>> getLabelNodes() {
        return labelNodes;
    }

    public int getNodeSize() {
        return nodeOrdering.size();
    }

    public List<Node> getNodeOrdering() {
        return nodeOrdering;
    }

    public void clear() {
        for (Map.Entry<String, Set<Node>> entry : labelNodes.entrySet()) {
            entry.getValue().clear();
        }

        for (Map.Entry<String, Set<List<Node>>> entry : labelEdges.entrySet()) {
            entry.getValue().clear();
        }

        nodeOrdering.clear();
    }

    public void setNodeOrdering(List<Node> nodeOrdering) {
        this.nodeOrdering = nodeOrdering;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nodes: \n");
        for (Map.Entry<String, Set<Node>> entry : labelNodes.entrySet()) {
            sb.append("\t").append(entry.getKey()).append(":").append(entry.getValue());
        }
        sb.append("Edges: \n");
        for (Map.Entry<String, Set<List<Node>>> entry : labelEdges.entrySet()) {
            sb.append("\t").append(entry.getKey()).append(":").append(entry.getValue());
        }

        return sb.toString();
    }
}
