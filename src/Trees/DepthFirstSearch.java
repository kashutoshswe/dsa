package Trees;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            //1st add the name of the current nnode
            array.add(name);
            //2nd add the children of the current node by calling depth first search on each children
            //what we are doing is going to every child, then to it's child, then to it's child, and when it is null, then
            //return an array
            for(Node child : children) {
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
