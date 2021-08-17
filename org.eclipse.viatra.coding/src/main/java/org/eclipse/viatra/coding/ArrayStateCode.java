package org.eclipse.viatra.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayStateCode implements IStateCode {
    @Override
    public Object processStateCode(Graph graph, Map<Node, Integer> nodeCerts) {
        List<Integer> nodeCodes = new ArrayList<>(nodeCerts.values());
        Collections.sort(nodeCodes);
        return nodeCodes.hashCode();
    }
}
