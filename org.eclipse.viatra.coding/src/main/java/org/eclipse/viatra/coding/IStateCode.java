package org.eclipse.viatra.coding;


import java.util.List;
import java.util.Map;

public interface IStateCode {
    Object processStateCode(Graph graph, Map<Node, Integer> nodeCerts);
}
