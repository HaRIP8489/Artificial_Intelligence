package lab2_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchAlgoTree implements ISearchAlgo{

    @Override
    public Node execute(Node root, String goal) {
        // TODO Auto-generated method stub
        Queue<Node> frontier = new LinkedList<Node>();
        List<Node> explored = new ArrayList<Node>();
        frontier.add(root);
        int count=0;
        while (!frontier.isEmpty()) {
            Node current = frontier.poll();
            if (current.getLabel().equals(goal))return current;
            explored.add(current);
            List<Node> children = current.getChildrenNodes();
            for (Node child : children) {
                if (!explored.contains(child)) {
                    frontier.add(child);
                    child.setParent(current);
                }
            }
        }
        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        // TODO Auto-generated method stub
        Queue<Node> frontier = new LinkedList<Node>();
        List<Node> explored = new ArrayList<Node>();
        Node nodeSt=executeHelper(root, start);
        frontier.add(nodeSt);
        while (!frontier.isEmpty()) {
            Node current = frontier.poll();
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
        }
        return null;
    }
    public Node executeHelper(Node root,String start) {
        Queue<Node> frontier = new LinkedList<Node>();
        List<Node> explored = new ArrayList<Node>();
        frontier.add(root);
        while (!frontier.isEmpty()) {
            Node current = frontier.poll();
            if (current.getLabel().equals(start)) {
                return current;
            }
            explored.add(current);
            List<Node> children = current.getChildrenNodes();
            for (Node child : children) {
                if (!frontier.contains(child) && !explored.contains(child))
                    frontier.add(child);
            }
        }
        return null;
    }

}
