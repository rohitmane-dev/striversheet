import java.util.*;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(){}
    TreeNode(TreeNode left , TreeNode right , int val){
        this.val = val;
        this.left = left;
        this.right = right;

    }

    TreeNode(int val ){
        this.val = val;

    }

    TreeNode(TreeNode left , TreeNode right ){
        this.left = left;
        this.right = right;
    }
}






public class Topview {
    public static void main(String[] args) {
        //lets buils the actudtial tree using this baove array data structured tree reoresentation . now using the constructor 

        // 🔹 Build a binary tree manually for demo:
        //          1
        //        /   \
        //       2     3
        //      / \   / \
        //     4   5 6   7
        // TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(2);
        // root.right = new TreeNode(3);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(5);
        // root.right.left = new TreeNode(6);
        // root.right.right = new TreeNode(7);



        // Tree:
        //
        //        1
        //       / \
        //      2   3
        //       \
        //        4
        //         \
        //          5
        //
        //Expected result correct = 2,1,3,5 but we got 2,1,3 which is not coorect 
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);


       // topView( root);
       //Bfs approach with a track of 
    }

    private static void bfsModified(TreeNode root){
        TreeNode node = root;
        Stack<TreeMap>st = new Stack<>();
        List<Integer>li = new ArrayList<>(); 
        Map<Integer,Integer>mp = new HashMap<>();
        st.push(root);
        while(!st.isEmpty()){
            
        }
    }

    // private static void topView(TreeNode root){
    //     Stack<TreeNode>st = new Stack<>();
    //     ArrayList<Integer>res = new ArrayList<>();

    //     TreeNode node = root;

    //     while (node!=null  ) {
            
    //         st.push(node);
    //         node = node.left;
            
    //     }
    //     //st.push(root);
    //     while (!st.isEmpty()) {
    //         res.add(st.pop().val);
    //     }
    //     node = root.right;

    //     while (node!=null ) {
            
    //         st.push(node);
    //         node = node.right;
            
    //     }
    //     //st.push(node);
    //     while (!st.isEmpty()) {
    //         res.add(st.pop().val);
    //     }

    //     System.out.println(res);


    // }

}
