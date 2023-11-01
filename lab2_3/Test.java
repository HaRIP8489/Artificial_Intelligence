package lab2_3;

public class Test {
    public static void main(String[] args) {
        Node nodeS=new Node("S");
        Node nodeA=new Node("A");
        Node nodeB=new Node("B");
        Node nodeC=new Node("C");
        Node nodeD=new Node("D");
        Node nodeE=new Node("E");
        Node nodeF=new Node("F");
        Node nodeG=new Node("G");
        Node nodeH=new Node("H");

        Node nodeP=new Node("P");
        Node nodeQ=new Node("Q");
        Node nodeR=new Node("R");

//		nodeS.addEdge(nodeA,5);
//		nodeS.addEdge(nodeB,2);
//		nodeS.addEdge(nodeC,4);
//		nodeA.addEdge(nodeD,9);
//		nodeA.addEdge(nodeE,4);
//		nodeB.addEdge(nodeG,6);
//		nodeC.addEdge(nodeF,2);
//		nodeD.addEdge(nodeH,7);
//		nodeE.addEdge(nodeG,6);
//		nodeF.addEdge(nodeG,11);

        nodeS.addEdge(nodeD,3);
        nodeS.addEdge(nodeE,9);
        nodeS.addEdge(nodeP,1);
        nodeD.addEdge(nodeB,1);
        nodeD.addEdge(nodeC,8);
        nodeD.addEdge(nodeE,2);
        nodeE.addEdge(nodeH,1);
        nodeE.addEdge(nodeR,9);
        nodeP.addEdge(nodeQ,15);
        nodeB.addEdge(nodeA,2);
        nodeC.addEdge(nodeA,2);
        nodeH.addEdge(nodeP,4);
        nodeH.addEdge(nodeQ,4);
        nodeR.addEdge(nodeF,5);
        nodeQ.addEdge(nodeR,3);
        nodeF.addEdge(nodeC,5);
        nodeF.addEdge(nodeG,5);


//		Task 1
//		BFS
//		(new BreadthFirstSearchAlgoGraph()).execute(nodeS,"G");
////		System.out.println((new NodeUtils()).printPath(nodeG));
//		DFS
//		(new DepthFirstSearchAlgoGraph()).execute(nodeS,"G");
//		System.out.println((new NodeUtils()).printPath(nodeG));

//		Task 2
//		BFS
//		(new BreadthFirstSearchAlgoGraph()).execute(nodeS,"H","G");
//		System.out.println((new NodeUtils()).printPath(nodeG));
//		DFS
//		(new DepthFirstSearchAlgoGraph()).execute(nodeS,"D","G");
//		System.out.println((new NodeUtils()).printPath(nodeG));

//		Task 3
//		BFS
//		(new BreadthFirstSearchAlgoTree()).execute(nodeS,"G");
//		System.out.println((new NodeUtils()).printPath(nodeG));
//
//		(new BreadthFirstSearchAlgoTree()).execute(nodeS,"D","G");
//		System.out.println((new NodeUtils()).printPath(nodeG));
//		DFS
//		(new DepthFirstSearchAlgoTree()).execute(nodeS,"G");
//		System.out.println((new NodeUtils()).printPath(nodeG));
//
//		(new DepthFirstSearchAlgoTree()).execute(nodeS,"E","G");
//		System.out.println((new NodeUtils()).printPath(nodeG));

//		Task 4
//		(new UniformCostSearchAlgo()).execute(nodeS, "G");
//		System.out.println((new NodeUtils()).printPath(nodeG));

//		Task 5
//		(new UniformCostSearchAlgo()).execute(nodeS,"Q","G");
//		System.out.println((new NodeUtils()).printPath(nodeG));

//      Task 6
//      (new UniformCostSearchAlgo()).depthLimitedUCS(nodeS,"G",4);
//      System.out.println((new NodeUtils()).printPath(nodeG));
    }
}
