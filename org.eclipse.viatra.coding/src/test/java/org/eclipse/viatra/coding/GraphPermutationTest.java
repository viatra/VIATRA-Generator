package org.eclipse.viatra.coding;

import me.tongfei.progressbar.ProgressBar;
import org.eclipse.viatra.coding.helper.GraphPermutation;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static org.junit.Assert.*;

public class GraphPermutationTest {
    @Test
    public void testPermutationSize() {
        GraphPermutation permutation = new GraphPermutation(true, true);

        for (int i = 1; i <= 5; i++) {
            int size = permutation.permuteGraphSize(i);
            assertEquals(1 << (i * i), size);
        }
    }

    @Test
    public void testUniqueGraph() {
        int size = 5;
        GraphPermutation permutation = new GraphPermutation(false, false);
        List<Graph> graphs = permutation.permuteGraph(size);
        Map<Object, List<Graph>> map = new HashMap<>();
        Encoder encoder = new Encoder(new Encoder.NativeHashCertificatePropagator(), new AdjacencyStateCode(10));
        for (Graph graph : graphs) {
            Object code = encoder.encode(graph);
            if (!map.containsKey(code)) {
                map.put(code, new ArrayList<>());
            }
            List<Graph> isomorphicGraphs = map.get(code);
            isomorphicGraphs.add(graph);
        }

        assertEquals(34, map.size());
    }

    @Test
    public void testUniqueGraph_4_Directed_SelfLoop() {
        int size = 4;
        GraphPermutation permutation = new GraphPermutation(true, true);
        List<Graph> graphs = permutation.permuteGraph(size);
        Map<Integer, List<Graph>> map = new HashMap<>();
        Encoder encoder = new Encoder(new Encoder.NativeHashCertificatePropagator(), new AdjacencyStateCode(10));
        for (Graph graph : graphs) {
            Integer code = encoder.encode(graph).hashCode();
            if (!map.containsKey(code)) {
                map.put(code, new ArrayList<>());
            }
            List<Graph> isomorphicGraphs = map.get(code);
            isomorphicGraphs.add(graph);
        }

        //assertEquals(34, map.keySet().size());
    }

    @Test
    public void testUniqueGraph_4_Directed_SelfLoop_FirstFail() {
        int size = 4;
        GraphPermutation permutation = new GraphPermutation(true, true);
        List<Graph> graphs = permutation.permuteGraph(size);
        Map<Object, List<Graph>> map = new HashMap<>();
        Encoder encoder = new Encoder(new AdjacencyStateCode(10));
        for (Graph graph : graphs) {
            Object code = encoder.encode(graph);
            if (!map.containsKey(code)) {
                map.put(code, new ArrayList<>());
            }
            List<Graph> isomorphicGraphs = map.get(code);
            isomorphicGraphs.add(graph);
        }
        //assertEquals(34, map.keySet().size());
        System.out.println(map.size());
        int failCount = 0;
        for (Map.Entry<Object, List<Graph>> entry : map.entrySet()) {
            List<Graph> isoGraphs = entry.getValue();
            if (isoGraphs.size() <= 1) {
                continue;
            }

            for (int j = 0; j < isoGraphs.size() - 1; j++) {
                boolean[][] refAdj = Utils.adjacencyMatrix(isoGraphs.get(j), isoGraphs.get(j).getNodeOrdering());

                for (int i = j + 1; i < isoGraphs.size(); i++) {
                    List<List<Node>> allPerms = new ArrayList<>();
                    permute(isoGraphs.get(i).getNodeOrdering(), 0, isoGraphs.get(i).getNodeOrdering().size() - 1, allPerms);
                    boolean equal = false;
                    for (List<Node> ordering : allPerms) {
                        if (Arrays.deepEquals(refAdj, Utils.adjacencyMatrix(isoGraphs.get(i), ordering))) {
                            equal = true;
                            break;
                        }
                    }

                    if (!equal) {
                        System.out.println(adjacencyMatrix2String(refAdj));
                        System.out.println(adjacencyMatrix2String(Utils.adjacencyMatrix(isoGraphs.get(i), allPerms.get(0))));
                        fail();
                    }
                }
            }
        }
    }

    @Test
    public void testUniqueGraph_4_Directional_SelfLoop_Statistics() {
        int size = 4;
        GraphPermutation permutation = new GraphPermutation(true, true);
        List<Graph> graphs = permutation.permuteGraph(size);
        Map<Object, List<Graph>> map = new HashMap<>();
        Encoder encoder = new Encoder(new AdjacencyStateCode(10));
        Instant start = Instant.now();

        for (Graph graph : graphs) {
            Object code = encoder.encode(graph);
            if (!map.containsKey(code)) {
                map.put(code, new ArrayList<>());
            }
            List<Graph> isomorphicGraphs = map.get(code);
            isomorphicGraphs.add(graph);
        }

        Instant end = Instant.now();
        System.out.println("Process Duration: " + Duration.between(start, end));

        //assertEquals(34, map.keySet().size());
        System.out.println("# Of distinct graph codes: " + map.size());
        int failCount = 0;
        for (Map.Entry<Object, List<Graph>> entry : map.entrySet()) {
            List<Graph> isoGraphs = entry.getValue();
            if (isoGraphs.size() <= 1) {
                continue;
            }

            for (int j = 0; j < isoGraphs.size() - 1; j++) {
                boolean[][] refAdj = Utils.adjacencyMatrix(isoGraphs.get(j), isoGraphs.get(j).getNodeOrdering());

                for (int i = j + 1; i < isoGraphs.size(); i++) {
                    if (!bruteForceIsomorphismCheck(refAdj, isoGraphs.get(j))) {
                        failCount++;
                    }
                }
            }
        }
        if (failCount > 0) {
            System.out.println("Pairwise Failure Count: " + failCount);
            System.out.println("Failure Count / # of graphs: " + (float)failCount / (1 << (size * size)));
            fail();
        }
    }

    @Test
    public void testUniqueGraph_Directional_SelfLoop_Soundness_Statistics() throws InterruptedException {
        int size = 3;
        GraphPermutation permutation = new GraphPermutation(true, true);
        List<Graph> graphs = permutation.permuteGraph(size);
        Map<Graph, Object> map = new HashMap<>();
        Encoder encoder = new Encoder(new AdjacencyStateCode(10));
        Instant start = Instant.now();
        for (int i = 0; i < graphs.size(); i++) {
            Graph graph = graphs.get(i);
            Object code = encoder.encode(graph);
            map.put(graph, code);
        }

        Instant end = Instant.now();
        System.out.println("Process Duration: " + Duration.between(start, end));

        //assertEquals(34, map.keySet().size());
        System.out.println("# of generated Graphs: " + map.size());
        long fn = 0;
        long tp = 0;
        long fp = 0;
        for (int i = 0; i < graphs.size() - 1; i++) {
            Graph g1 = graphs.get(i);
            boolean[][] refAdj = Utils.adjacencyMatrix(g1, g1.getNodeOrdering());
            for (int j = i + 1; j < graphs.size(); j++) {
                Graph g2 = graphs.get(j);
                boolean equal = bruteForceIsomorphismCheck(refAdj, g2);
                Object code = map.get(g1);
                boolean proposed = map.get(g1).equals(map.get(g2)) && map.get(g1).hashCode() == map.get(g2).hashCode();
                if(equal && !proposed) {
                    fn++;
                } else if(equal && proposed) {
                    tp++;
                } else if (!equal & proposed) {
                    fp++;
                }
            }

        }


        System.out.println("True Positives:" + tp);
        System.out.println("False Negatives: " + fn);
        System.out.println("False Positives: " + fp);
        System.out.println("Precision: " + (double)tp/(tp + fp));
        System.out.println("Recall: " + (double)tp / (tp + fn));

        if (fn > 0 ||fp > 0) {
            fail();
        }
    }

    static void testProgress(int all, int now) {
        final int MAX_PIPE_CHAR = 10;
        float num = now * MAX_PIPE_CHAR * 1.01f; // 1.01f to account for any round off
        int current = (int) (num / all);
        int rest = MAX_PIPE_CHAR - current;

        System.out.print("\r[");
        for (int a = 1; a <= current; a++) {
            System.out.print("|");
        }
        for (int b = 1; b <= rest; b++) {
            System.out.print(" ");
        }
        System.out.print("]");

    }

    private void permute(List<Node> nodes, int l, int r, List<List<Node>> result)
    {
        if (l == r)
            result.add(new ArrayList<>(nodes));
        else
        {
            for (int i = l; i <= r; i++)
            {
                swap(nodes,l,i);
                permute(nodes, l+1, r, result);
                swap(nodes,l,i);
            }
        }
    }

    private void swap(List<Node> list, int l, int r) {
        Node temp = list.get(l);
        list.set(l, list.get(r));
        list.set(r, temp);
    }

    private boolean bruteForceIsomorphismCheck(boolean[][] refAdj, Graph graph2) {
            List<List<Node>> allPerms = new ArrayList<>();
            permute(graph2.getNodeOrdering(), 0, graph2.getNodeOrdering().size() - 1, allPerms);

            for (List<Node> ordering : allPerms) {
                if (Arrays.deepEquals(refAdj, Utils.adjacencyMatrix(graph2, ordering))) {
                    return true;
                }
            }

            return false;
    }

    private String adjacencyMatrix2String(boolean[][] adj) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                sb.append(adj[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    @Test
    public void testUniqueStateCodes_4_Directed_SelfLoop() {
        int size = 4;
        GraphPermutation permutation = new GraphPermutation(true, true);
        Set<Object> set = new HashSet<>(permutation.permuteStateCode(size, new Encoder(new Encoder.HashCertificatePropagator(), new AdjacencyStateCode(10))));
        System.out.println(set.size());
        //assertEquals(34, set.size());
    }

    @Test
    public void testUniqueStateCodes() {
        int size = 5;
        GraphPermutation permutation = new GraphPermutation(false, false);
        Set<Object> set = new HashSet<>(permutation.permuteStateCode(size, new Encoder(new Encoder.HashCertificatePropagator(), new ArrayStateCode())));

        assertEquals(34, set.size());
    }

    @Test
    public void testPermutation() {
        int size = 5;
        assertEquals(1 << 10, (new GraphPermutation(false, false)).permuteGraphSize(size));
        assertEquals(1 << 20, (new GraphPermutation(false, true)).permuteGraphSize(size));
        assertEquals(1 << 15, (new GraphPermutation(true, false)).permuteGraphSize(size));
        assertEquals(1 << 25, (new GraphPermutation(true, true)).permuteGraphSize(size));
    }

}
