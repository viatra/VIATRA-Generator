package org.eclipse.viatra.coding;

public class Node {
    String id;

    public Node(String id) {
        this.id = id;
    }

    public Node() {

    }

    @Override
    public String toString(){
        return id;
    }

}
