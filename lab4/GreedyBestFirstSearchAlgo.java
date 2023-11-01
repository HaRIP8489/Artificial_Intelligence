package lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class GreedyBestFirstSearchAlgo implements IInformedSearchAlgo {

    @Override
    public Node execute(Node root, String goal) {
        // TODO Auto-generated method stub
        PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
        List<Node> explored=new  ArrayList<Node>();
        frontier.add(root);
        while(!frontier.isEmpty()) {
            Node current=frontier.poll();
            if(current.getLabel().equals(goal))
                return current;
            explored.add(current);
            List<Edge> children=current.getChildren();
            for(Edge child: children) {
                Node  end=child.getEnd();
                if(!frontier.contains(end)&&!explored.contains(end)) {
                    end.setParent(current);
                    end.setG(current.getG()+child.getWeight());
                    frontier.add(end);
                }
            }
        }
        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        // TODO Auto-generated method stub
        return null;
    }

    class NodeComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            // TODO Auto-generated method stub
            int x = Double.compare(o1.getG(), o2.getG());
            if (x == 0)
                return o1.getLabel().compareTo(o2.getLabel());
            return x;
        }
    }

}
