import java.util.*;
//Clean code with comments

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

public class finalBoundryTrav {
    public static void main(String[] args){
       
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

       
        addLeftBoundry(root);
        addLeafNode(root);
        addRightBoundry(root.right);


     
    }

  

    private static void addLeftBoundry(TreeNode node ){

        while(!isLeafNode(node)){
        

            if(!isLeafNode(node)){ // intermidiate node --> print its value
                System.out.println(node.val);
            }
            if(node.left!=null){
            //iterate for left side

                node = node.left;
            }else{
                //if left not available the choose right child as a node
                node = node.right;
            }
        }
        
    }
    private static void addRightBoundry(TreeNode node ){

        while(!isLeafNode(node)){
            

            if(!isLeafNode(node)){
                System.out.println(node.val);
            }
            if(node.right!=null){
                

                node = node.right;
            }else{
                
                node = node.left;
            }
        }
        
    }

    private static void addLeafNode(TreeNode node){ //inorder traversal codde + minor update 
        
        Stack<TreeNode>stack = new Stack<>();//to get retrack or backtrack the nodes

        while (true) {
            if(node != null){
                stack.push(node);
                node  =node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                if(isLeafNode(node))System.out.println(node.val); ///print only leaf node
                node = node.right;
            }
        }
    }
 
    private static boolean isLeafNode(TreeNode node){  //to check if node is leaf or not 
        if(node.left==null && node.right==null)return true;
        return false;
    }
}
