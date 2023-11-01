package lab2_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class UniformCostSearchAlgo implements ISearchAlgo {

    @Override
    public Node execute(Node root, String goal) {
        // TODO Auto-generated method stub
        PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
        Set<Node> explored = new HashSet<Node>();
        frontier.add(root);
        while (!frontier.isEmpty()) {
            Node current = frontier.poll();
            if (current.getLabel().equals(goal))
                return current;
            explored.add(current);
            List<Edge> children = current.getChildren();
            for (Edge child : children) {
                double newPathCost = current.getPathCost() + child.getWeight();
                Node end = child.getEnd();
                if (!explored.contains(end) && !frontier.contains(end)) {
                    frontier.add(end);
                    end.setPathCost(newPathCost);
                    end.setParent(current);
                } else if (frontier.contains(end) && end.getPathCost() > newPathCost) {
                    end.setPathCost(newPathCost);
                    end.setParent(current);
                }
            }
        }
        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        // TODO Auto-generated method stub
        PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
        Set<Node> explored = new HashSet<Node>();
        Node nodeSt=executeHelper(root, start);
        frontier.add(nodeSt);
        while (!frontier.isEmpty()) {
            Node current = frontier.poll();
            if (current.getLabel().equals(goal))
                return current;
            explored.add(current);
            List<Edge> children = current.getChildren();
            for (Edge child : children) {
                double newPathCost = current.getPathCost() + child.getWeight();
                Node end = child.getEnd();
                if (!explored.contains(end) && !frontier.contains(end)) {
                    frontier.add(end);
                    end.setPathCost(newPathCost);
                    end.setParent(current);
                } else if (frontier.contains(end) && end.getPathCost() > newPathCost) {
                    end.setPathCost(newPathCost);
                    end.setParent(current);
                }
            }
        }
        return null;
    }
    public Node depthLimitedUCS(Node root,String goal,int limit) {
        PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
        Set<Node> explored = new HashSet<Node>();
        frontier.add(root);
        while (!frontier.isEmpty()) {
            if(limit<0) break;
            Node current = frontier.poll();
            if (current.getLabel().equals(goal))
                return current;
            explored.add(current);
            List<Edge> children = current.getChildren();
            for (Edge child : children) {
                double newPathCost = current.getPathCost() + child.getWeight();
                Node end = child.getEnd();
                if (!explored.contains(end) && !frontier.contains(end)) {
                    frontier.add(end);
                    end.setPathCost(newPathCost);
                    end.setParent(current);
                } else if (frontier.contains(end) && end.getPathCost() > newPathCost) {
                    end.setPathCost(newPathCost);
                    end.setParent(current);
                }
            }
            limit--;
        }
        return null;
    }
    class NodeComparator implements Comparator<Node>{

        @Override
        public int compare(Node o1, Node o2) {
            // TODO Auto-generated method stub
            int x=Double.compare(o1.getPathCost(),o2.getPathCost());
            if(x==0) return o1.getLabel().compareTo(o2.getLabel());
            return x;
        }
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
