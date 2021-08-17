package org.eclipse.viatra.coding;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestAdjacencyStateCode {
    Graph graph;

    @Before
    public void setup(){
        List<String> nodeLabels = Collections.singletonList("1");
        List<String> edgeLabels = Arrays.asList("a", "b");

        graph = new Graph(nodeLabels, edgeLabels);
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nodes.add(new Node(Integer.toString(i)));
            graph.addNode(nodes.get(i), "1");
        }

        graph.addEdge(nodes.get(4), nodes.get(3), "a");
        graph.addEdge(nodes.get(3), nodes.get(1), "b");
        graph.addEdge(nodes.get(2), nodes.get(4), "b");
        graph.addEdge(nodes.get(1), nodes.get(2), "a");
        graph.addEdge(nodes.get(1), nodes.get(0), "a");
        graph.addEdge(nodes.get(0), nodes.get(4), "b");
    }

    @Test
    public void testAdjacencyStateCode () {
        Encoder encoder = new Encoder(new AdjacencyStateCode(10));
        AdjacencyStateCode adj = (AdjacencyStateCode) encoder.encode(graph);
        System.out.println(adj.toString());
    }
}
