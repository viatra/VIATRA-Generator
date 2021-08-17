package org.eclipse.viatra.coding;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PreliminaryTest {
    Graph graph;
    Graph isomorphicGraph;

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

        isomorphicGraph = new Graph(nodeLabels, edgeLabels);
        nodes = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            nodes.add(new Node(Integer.toString(i)));
            isomorphicGraph.addNode(nodes.get(i - 1), "1");
        }
        isomorphicGraph.addEdge(nodes.get(3), nodes.get(4), "a");
        isomorphicGraph.addEdge(nodes.get(1), nodes.get(3), "b");
        isomorphicGraph.addEdge(nodes.get(3), nodes.get(2), "a");
        isomorphicGraph.addEdge(nodes.get(2), nodes.get(0), "b");
        isomorphicGraph.addEdge(nodes.get(4), nodes.get(0), "b");
        isomorphicGraph.addEdge(nodes.get(0), nodes.get(1), "a");
    }

    @Test
    public void testEncoding() {
        assertNotNull(graph);
        Encoder e = new Encoder(new Encoder.NativeHashCertificatePropagator(), new AdjacencyStateCode(10));
        Object value = e.encode(graph);
        Object isomorphicValue = e.encode(isomorphicGraph);
        assertEquals(value.hashCode(), isomorphicValue.hashCode());
        assertEquals(value, isomorphicValue);
//        assertEquals(1618256179, value.hashCode());
    }

    @Test
    public void adjacencyMatrixTest() {
        List<String> nodeLabel = Collections.singletonList("node");
        List<String> edgeLabel = Collections.singletonList("edge");
        graph = new Graph(nodeLabel, edgeLabel);
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            nodes.add(new Node());
            graph.addNode(nodes.get(i), nodeLabel.get(0));
        }

//        for (Node from : nodes) {
//            for (Node to : nodes) {
//                graph.addEdge(from ,to, edgeLabel.get(0));
//            }
//        }

        graph.addEdge(nodes.get(0), nodes.get(1), edgeLabel.get(0));
        graph.addEdge(nodes.get(0), nodes.get(0), edgeLabel.get(0));
        graph.addEdge(nodes.get(0), nodes.get(2), edgeLabel.get(0));
        graph.addEdge(nodes.get(2), nodes.get(3), edgeLabel.get(0));


        boolean[][] adj = Utils.adjacencyMatrix(graph, nodes);
        System.out.println(Arrays.deepToString(adj));
    }

}
