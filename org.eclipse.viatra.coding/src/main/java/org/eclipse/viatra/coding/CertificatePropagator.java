package org.eclipse.viatra.coding;

public interface CertificatePropagator {
    // generate a new certificate for the edge based on the old certificate
    int newCert(int old, String edgeLabel, int srcCert, int tgtCert);
}
