/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.viatra.dse.api.DSEException;

/**
 * Utility class that encapsulates a {@link MessageDigest} instance to aid calculating hash values more easily, and to
 * reuse a {@link MessageDigest} instance.
 * 
 */
public final class Hasher {
    private MessageDigest md;

    private static final int HEX = 16;

    private Hasher(MessageDigest md) {
        this.md = md;
    }

    /**
     * Calculates and returns a hash value.
     * 
     * @param data
     *            the data to be hashed in a {@link String}.
     * @return the hash value in some {@link String} representation.
     */
    public String hash(String data) {
        md.update(data.getBytes(), 0, data.length());
        return new String(md.digest());
    }

    @SuppressWarnings("unused")
    private String alternateHashBest(String data) {
        md.update(data.getBytes(), 0, data.length());
        return new String(md.digest());
    }

    @SuppressWarnings("unused")
    private String alternateHashSecondBest(String data) {
        md.update(data.getBytes(), 0, data.length());
        return new BigInteger(1, md.digest()).toString(HEX);
    }

    @SuppressWarnings("unused")
    private String alternateHashThirdBest(String data) {
        md.update(data.getBytes(), 0, data.length());
        byte[] array = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(Integer.toHexString((int) array[i]));
        }
        return sb.toString();
    }

    /**
     * Returns a {@link Hasher} with an internal {@link MessageDigest} that is based on the protocol named
     * {@code protocoll}.
     * 
     * @param protocoll
     *            the name of the hash algorythm.
     * @return the initialized {@link Hasher}
     * 
     * @throws DSEException
     *             on initialization failure.
     */
    public static Hasher getHasher(String protocoll) {
        try {
            return new Hasher(MessageDigest.getInstance(protocoll));
        } catch (NoSuchAlgorithmException e) {
            throw new DSEException(e);
        }
    }

    public static final String SHA1_PROTOCOLL = "SHA-1";
}
