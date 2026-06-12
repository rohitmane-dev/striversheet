import java.util.*;
//Rough code canavas..

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }

    TreeNode(){};
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    

}

public class BoundryTraversalOfBinarTree {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        //int [] ip = {1,2,3,4,5,6,7,9,9};
//lets buils the actudtial tree using this baove array data structured tree reoresentation . now using the constructor 

        // 🔹 Build a binary tree manually for demo:
        //          1
        //        /   \
        //       2     3
        //      / \   / \
        //     4   5 6   7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ///boundery(root);
        addLeftBoundry(root);
        addLeafNode(root);
        addRightBoundry(root.right);


       // System.out.println(boundery(root));
    }

    // private static void boundery(TreeNode root){
    //     List<TreeNode>li = new ArrayList<>();

    //     Queue<TreeNode>queue = new ArrayDeque<>();
    //     queue.add(root);
    //     TreeNode node = root;
    //     System.out.println(node.val);

    //     while(!isLeafNode(node)){
    //         //node = queue.remove();

    //         node = root.left;

    //         if(!isLeafNode(node)){
    //             System.out.println(node.val);
    //         }
    //         if(node.left!=null){
    //             //queue.add(node.left);
                
    //             //System.out.println(node.left.val);

    //             node = node.left;
    //         }else{
    //             //queue.add(node.right);
    //             //System.out.println(node.right.val);
    //             node = node.right;
    //         }
    //     }
        
    //     //queue.removeAll(queue());

    //     node = root.right;

    //     while(!isLeafNode(node)){
    //         node = queue.remove();
    //         if(node.right!=null){
    //             queue.add(node.right);
    //             System.out.println(node.right.val);
    //         }else if(node.left!=null){
    //             queue.add(node.left);
    //             System.out.println(node.left.val);
    //         }
    //     }
        



    //     // return 0;
        
    // }

    private static void addLeftBoundry(TreeNode node ){

        while(!isLeafNode(node)){
            //node = queue.remove();

            //node = root.left;

            if(!isLeafNode(node)){
                System.out.println(node.val);
            }
            if(node.left!=null){
                //queue.add(node.left);
                
                //System.out.println(node.left.val);

                node = node.left;
            }else{
                //queue.add(node.right);
                //System.out.println(node.right.val);
                node = node.right;
            }
        }
        
    }
    private static void addRightBoundry(TreeNode node ){

        while(!isLeafNode(node)){
            //node = queue.remove();

            //node = root.left;

            if(!isLeafNode(node)){
                System.out.println(node.val);
            }
            if(node.right!=null){
                //queue.add(noright);
                
                //System.out.println(noright.val);

                node = node.right;
            }else{
                //queue.add(node.right);
                //System.out.println(node.right.val);
                node = node.left;
            }
        }
        
    }

    private static void addLeafNode(TreeNode node){
        
        Stack<TreeNode>stack = new Stack<>();
        while (true) {
            if(node != null){
                stack.push(node);
                node  =node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                if(isLeafNode(node))System.out.println(node.val);
                node = node.right;
            }
        }
    }

    private static boolean isLeafNode(TreeNode node){
        if(node.left==null && node.right==null)return true;
        return false;
    }
}
