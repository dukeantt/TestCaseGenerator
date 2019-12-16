package app.path;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class
Branch {
    private ArrayList<Node> nodes = new ArrayList<Node>();

    public void add(Node node) {
        nodes.add(node);
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public String toString() {
        String s = "";
        for (Node n : nodes) {
            s = s + n.getValue() + "-";
        }
        return s;
    }

    public Set<Integer> toSet() {
        Set<Integer> set = new HashSet<>();
        for (Node n : nodes) {
            set.add(n.getValue());
        }
        return set;
    }

}
