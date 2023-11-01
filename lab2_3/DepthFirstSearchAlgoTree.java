package lab2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchAlgoTree implements ISearchAlgo {

    @Override
    public Node execute(Node root, String goal) {
        // TODO Auto-generated method stub
        Stack<Node> frontier = new Stack<Node>();
        List<Node> explored = new ArrayList<Node>();
        Stack<Node> help = new Stack<Node>();
        frontier.size();
        help.add(root);
        Node hp = null;
        while (!help.isEmpty()) {
            Node current = help.pop();
            if (current.getLabel().equals(goal))
                return current;
            explored.add(current);
            List<Node> children = current.getChildrenNodes();
            for (Node child : children) {
                if (!explored.contains(child)) {
                    frontier.add(child);
                    child.setParent(current);
                }
            }
            int x = frontier.size();
            for (int i = 0; i < x; i++) {
                hp = frontier.pop();
                help.push(hp);
            }
        }
        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        // TODO Auto-generated method stub
        Stack<Node> frontier = new Stack<Node>();
        List<Node> explored = new ArrayList<Node>();
        Stack<Node> help = new Stack<Node>();
        Node nodeSt = executeHelper(root, start);
        frontier.size();
        help.add(nodeSt);
        Node hp = null;
        while (!help.isEmpty()) {
            Node current = help.pop();
            if (current.getLabel().equals(goal))
                return current;
            explored.add(current);
            List<Node> children = current.getChildrenNodes();
            for (Node child : children) {
                if (!explored.contains(child)) {
                    frontier.add(child);
                    child.setParent(current);
                }
            }
            int x = frontier.size();
            for (int i = 0; i < x; i++) {
                hp = frontier.pop();
                help.push(hp);
            }
        }
        return null;
    }

    public Node executeHelper(Node root, String start) {
        Stack<Node> frontier = new Stack<Node>();
        List<Node> explored = new ArrayList<Node>();
        Stack<Node> help = new Stack<Node>();
        frontier.size();
        help.add(root);
        Node hp = null;
        while (!help.isEmpty()) {
            Node current = help.pop();
            if (current.getLabel().equals(start))
                return current;
            explored.add(current);
            List<Node> children = current.getChildrenNodes();
            for (Node child : children) {
                if (!help.contains(child) && !explored.contains(child)) {
                    frontier.add(child);
                }
            }
            int x = frontier.size();
            for (int i = 0; i < x; i++) {
                hp = frontier.pop();
                help.push(hp);
            }
        }
        return null;
    }
}
