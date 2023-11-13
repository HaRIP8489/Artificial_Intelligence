package lab6;

public class Test {
    public static void main(String[] args) {
        Node n=new Node();
        n.generateBoard();
        n.displayBoard();
        System.out.println("---");
        System.out.println(n.getH());

//		Queen q1=new Queen(6, 0);
//		Queen q2=new Queen(4, 1);
//		Queen q3=new Queen(1, 2);
//		Queen q4=new Queen(2, 3);
//		Queen q5=new Queen(6, 4);
//		Queen q6=new Queen(1, 5);
//		Queen q7=new Queen(3, 6);
//		Queen q8=new Queen(7, 7);
//		Queen[] state= {q1,q2,q3,q4,q5,q6,q7,q8};
//		Node n=new Node(state);
//		n.displayBoard();
//		System.out.println(n.getH());
    }
}