package org.eclipse.viatra.coding.helper;

import org.eclipse.viatra.coding.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * generate all the graph with certain number of nodes by permute the edges,
 * currently only support one edge type and one node type
 */
public class GraphPermutation {
    private final static String NODE_TYPE = "node";
    private final static String EDGE_TYPE = "edge";
    private boolean allowSelfLoop;
    private boolean isDirectional;

    public GraphPermutation() {
        allowSelfLoop = false;
        isDirectional = false;
    }

    public GraphPermutation(boolean allowSelfLoop, boolean isDirectional) {
        this.allowSelfLoop = allowSelfLoop;
        this.isDirectional = isDirectional;
    }

    public boolean isAllowSelfLoop() {
        return allowSelfLoop;
    }

    public void setAllowSelfLoop(boolean allowSelfLoop) {
        this.allowSelfLoop = allowSelfLoop;
    }

    public boolean isDirectional() {
        return isDirectional;
    }

    public void setDirectional(boolean directional) {
        isDirectional = directional;
    }

    public List<Graph> permuteGraph(int n) {
        List<Graph> graphs = new ArrayList<>();
        permute(n, g -> graphs.add(new Graph(g)));
        return graphs;
    }

    public List<Object> permuteStateCode(int n, Encoder encoder) {
        List<Object> stateCodes = new ArrayList<>();
        permute(n, g -> stateCodes.add(encoder.encode(g)));
        return stateCodes;
    }

    public int permuteGraphSize(int n) {
        AtomicInteger num = new AtomicInteger();
        permute(n, g -> num.addAndGet(1));
        return num.get();
    }

    public void permute(int n, Consumer<Graph> processor) {
        Graph graph = prepareGraph(n);
        List<Node> nodes = new ArrayList<>(graph.getLabelNodes().get(NODE_TYPE));
        assert nodes.size() == n;
        int startingTgt = allowSelfLoop? 0 : 1;
        recursiveGraphPermutation(graph, nodes, 0, startingTgt, EDGE_TYPE, processor);
    }

    private Graph prepareGraph(int n) {
        List<String> nodeLabels = Collections.singletonList(NODE_TYPE);
        List<String> edgeLabels = Collections.singletonList(EDGE_TYPE);
        Graph graph = new Graph(nodeLabels, edgeLabels);

        for (int i = 0; i < n; i++) {
            graph.addNode(new Node(Integer.toString(i)), NODE_TYPE);
        }

        return graph;
    }

    private void recursiveGraphPermutation(Graph graph, List<Node> nodes, int src, int tgt, String edgeType, Consumer<Graph> processNewFoundGraph) {
        if (src >= nodes.size()) {
            processNewFoundGraph.accept(graph);
            return;
        }

        if (tgt >= nodes.size()) {
            if (!isDirectional) {
                recursiveGraphPermutation(graph, nodes, src + 1, src + 1, edgeType, processNewFoundGraph);
            } else {
                recursiveGraphPermutation(graph, nodes, src + 1, 0, edgeType, processNewFoundGraph);
            }

            return;
        }

        // recurse without this edge
        recursiveGraphPermutation(graph, nodes, src, tgt + 1, edgeType, processNewFoundGraph);

        //add the edge and recurse with the edge
        // no self loop check
        if (allowSelfLoop || src != tgt) {
            graph.addEdge(nodes.get(src), nodes.get(tgt), edgeType);

            // if not direction, add both directions
            if (!isDirectional) {
                graph.addEdge(nodes.get(tgt), nodes.get(src), edgeType);
            }

            recursiveGraphPermutation(graph, nodes, src, tgt + 1, edgeType, processNewFoundGraph);
            graph.removeEdge(nodes.get(src), nodes.get(tgt), edgeType);

            // if not direction, remove both directions
            if (!isDirectional) {
                graph.removeEdge(nodes.get(tgt), nodes.get(src), edgeType);
            }
        }
    }

}
