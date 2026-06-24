import java.util.*;
class ps4{
    public static void main(String[] args) {
        
        solution s = new solution();
        List<List<Integer>>li = new ArrayList<>();
        li.add(Arrays.asList(0,1,0));
        li.add(Arrays.asList(0,0,0));
        li.add(Arrays.asList(0,1,0));
        // System.out.println(s.sol(li));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Pair{
    int val;
    TreeNode node ;

}

// class solution{
//     public List<List<Integer>> sol(TreeNode root){
//         List<List<Integer>> res = new ArrayList<>();
//         if(root==null)return res;
//         // int celebrity=-1;

//         // Stack<TreeNode>st = new Stack<>();
//         // PriorityQueue<Integer, TreeNode> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
//         // st.push(root);
//         // pq.add(0,root);

//         Stack<Pair<Integer, TreeNode>> st = new Stack<>();
//         int dir = 1; 
//         //+1 --> left to right
//         //-1 --> right to left
//         int lvl=-1;

//         // while(!st.isEmpty()){
//         while(!pq.isEmpty()){
//             // TreeNode curr = st.pop();
//             Pair<Integer, TreeNode> p = st.pop();

//             int currlvl = p.getKey();
//             TreeNode curr = p.getValue();

//             if (currlvl> lvl) {
//                 List<Integer>li = new LinkedList<>();
//                 lvl = currlvl;
//             }
//                 li.add(curr.val);

//             if(dir == 1){
//                 //put the left node 1st then right
//                 // if(curr.left != null)st.push(curr.left);
//                 // if(curr.right!= null )st.push(curr.right);
//                 if(curr.left != null)pq.add(lvl+1,curr.left);
//                 if(curr.right!= null )st.push(curr.right);
//             }else{
//                 //put the right node 1st then left
//                 if(curr.right!= null )st.push(curr.right);
//                 if(curr.left != null)st.push(curr.left);
        
//             }



//         }




        
//     }

// }


class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if(root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        boolean leftToRight = true;

        while(!q.isEmpty()){

            int size = q.size();

            LinkedList<Integer> level =
                    new LinkedList<>();

            for(int i=0;i<size;i++){

                TreeNode curr = q.poll();

                if(leftToRight)
                    level.addLast(curr.val);
                else
                    level.addFirst(curr.val);

                if(curr.left != null)
                    q.offer(curr.left);

                if(curr.right != null)
                    q.offer(curr.right);
            }

            res.add(level);

            leftToRight = !leftToRight;
        }

        return res;
    }
}