package org.eclipse.viatra.coding;


import java.util.*;
import java.util.stream.Collectors;

public class Encoder {
    private CertificatePropagator certificate;
    private IStateCode stateCoder;

    public Encoder(IStateCode stateCoder) {
        certificate = new BinaryCertificatePropagator();
        this.stateCoder = stateCoder;
    }

    public Encoder(CertificatePropagator certificate, IStateCode stateCoder) {
        this.certificate = certificate;
        this.stateCoder = stateCoder;
    }

    public Object encode(Graph g) {
        Map<Node, Integer> temp = new HashMap<>();
        Map<List<Node>, Integer> edgeCerts = new HashMap<>();
        Map<Node, Integer> nodeCerts = new HashMap<>();

        for (Map.Entry<String, Set<List<Node>>> entry : g.getLabelEdges().entrySet()) {
            for (List<Node> edge : entry.getValue()) {
                edgeCerts.put(edge, entry.getKey().hashCode());
            }
        }

        for (Map.Entry<String, Set<Node>> entry : g.getLabelNodes().entrySet()) {
            for (Node node : entry.getValue()) {
                nodeCerts.put(node, entry.getKey().hashCode());
                temp.put(node, 0);
            }
        }
        int partSize = 1, oldPartSize;

        do {
            oldPartSize = partSize;
            for (Map.Entry<String, Set<List<Node>>> entry : g.getLabelEdges().entrySet()) {
                for (List<Node> edge : entry.getValue()) {
                    int newEdgeCerts = certificate.newCert(edgeCerts.get(edge), entry.getKey(), nodeCerts.get(edge.get(0)), nodeCerts.get(edge.get(1)));
                    edgeCerts.put(edge, newEdgeCerts);

                    // propagate the changes
                    // add one to distinguish the incoming edge and outgoing edge
                    if(edge.get(0) != edge.get(1)) {
                        temp.put(edge.get(0), temp.get(edge.get(0)) + newEdgeCerts + 1);
                    } else {
                        temp.put(edge.get(0), temp.get(edge.get(0)) + newEdgeCerts + 2);
                    }

                    temp.put(edge.get(1), temp.get(edge.get(1)) - newEdgeCerts);
                }
            }

            Set<Integer> certSet = new HashSet<>();
            for (Map.Entry<String, Set<Node>> entry : g.getLabelNodes().entrySet()) {
                for (Node node : entry.getValue()) {
                    nodeCerts.put(node, nodeCerts.get(node) + temp.get(node));
                    temp.put(node, 0);
                    certSet.add(nodeCerts.get(node));
                }
            }
            partSize = certSet.size();
        } while (partSize > oldPartSize);

        return stateCoder.processStateCode(g, nodeCerts);
    }

    static class BinaryCertificatePropagator implements CertificatePropagator {
        @Override
        public int newCert(int old, String edgeLabel, int srcCert, int tgtCert) {
            int srcShift = 8;
            int tgtShift = (edgeLabel.hashCode() & 0xf);
            return ((srcCert << srcShift) | (srcCert >>> (32 - srcShift))) + ((tgtCert << tgtShift) | (tgtCert >>> (32 - tgtCert))) + old;
        }
    }

    static class HashCertificatePropagator implements CertificatePropagator {
        private static final int PRIME = 31;

        @Override
        public int newCert(int old, String edgeLabel, int srcCert, int tgtCert) {
            int edgeHash = edgeLabel.hashCode();
            int result = (edgeHash ^ (edgeHash >>> (PRIME + 1)));
            result = PRIME * result + srcCert;
            result = PRIME * result + tgtCert;
            return result + old;
        }
    }

    static class NativeHashCertificatePropagator implements CertificatePropagator {
        @Override
        public int newCert(int old, String edgeLabel, int srcCert, int tgtCert) {
            return Objects.hash(edgeLabel, srcCert, tgtCert) + old;
        }
    }
}
