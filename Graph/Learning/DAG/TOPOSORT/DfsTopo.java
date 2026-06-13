import java.util.*;

class DfsTopo{
    public static void main(String [] args){
        //dfs based topological sort
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<6;i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);

        boolean []vis = new boolean[6];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<6;i++){ //use ful when graph is not connected
            if(!vis[i]){
                dfs(i,adj,vis,st);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>>adj, boolean []vis, Stack<Integer> st){
        vis[node] = true;
        for(int j:adj.get(node)){
            if(!vis[j]){
                dfs(j,adj,vis,st);
            }
        }
        st.push(node);
    }

}