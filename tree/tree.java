import java.util.Scanner;

class tree{

    class Node{

        //reference to the right and left nodes
        Node left ;
        Node right;

        int data; // to store the data of the given node value

        public Node(int key){
            data = key;
            left =null;
            right = null;
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        tree t = new tree();

        Node root = t.new Node(1);

        root.left = t.new Node(2);
        root.left = t.new Node(2);
    }
}