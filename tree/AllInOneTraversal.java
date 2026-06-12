import java.util.*;

// Binary tree node class
class TreeNode { 
    int val;             // Value of the node
    TreeNode left, right; // Left and right children

    TreeNode(int val) {
        this.val = val;
    }
}

// Helper class to hold node with its traversal state
class Pair {
    TreeNode node;
    int state; // 1 -> preorder, 2 -> inorder, 3 -> postorder

    Pair(TreeNode node, int state) {
        this.node = node;
        this.state = state;
    }
}

public class AllInOneTraversal {
    public static void main(String[] args) {
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



        // Lists to store traversal outputs
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();


        // Stack to simulate recursion using Pair(node, state)
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1)); // Start with root in "preorder" state

        
        // Iterative traversal
        while (!st.isEmpty()) {
            Pair curr = st.pop(); // Get top element from stack

            if (curr.state == 1) { 
                // 🔹 Preorder phase (Node -> Left -> Right)
                preorder.add(curr.node.val);

                // Increase state and push back to process again later
                curr.state++;
                st.push(curr);

                // If left child exists, process it first
                if (curr.node.left != null) {
                    st.push(new Pair(curr.node.left, 1));
                }

            } else if (curr.state == 2) { 
                // 🔹 Inorder phase (Left -> Node -> Right)
                inorder.add(curr.node.val);

                // Increase state and push back to process again later
                curr.state++;
                st.push(curr);

                // If right child exists, process it next
                if (curr.node.right != null) {
                    st.push(new Pair(curr.node.right, 1));
                }

            } else { 
                // 🔹 Postorder phase (Left -> Right -> Node)
                postorder.add(curr.node.val);
            }
        }

        // Print all traversals
        System.out.println("Preorder  : " + preorder);
        System.out.println("Inorder   : " + inorder);
        System.out.println("Postorder : " + postorder);
    }
}
