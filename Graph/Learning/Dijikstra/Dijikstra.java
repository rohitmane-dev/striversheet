import java.util.*;

class Dijikstra{
    public static void main(String [] args){
        System.out.print("Dijikstra's algo:");

        Solution s = new Solution();
        ArrayList<ArrayList<int [] >>adj = new ArrayList<>();
        for(int i=0;i<6;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new int [] {1,2});
        adj.get(0).add(new int [] {2,4});
        adj.get(1).add(new int [] {2,1});
        adj.get(1).add(new int [] {3,7});
        adj.get(2).add(new int [] {4,3});
        adj.get(3).add(new int [] {5,1});
        adj.get(4).add(new int [] {3,2});
        adj.get(4).add(new int [] {5,5});
        int V = 6;
        int S = 0;
        int[] res = s.dijkstra(V, adj, S);
       
        for(int i:res){

            // i== Integer.MAX_VALUE ? System.out.print("INF ") : System.out.print(i+" ");
            System.out.print(i+" ");
        }
    }

}

//Step 1: Build a Adjency List ... which we already have given via input.
        //and A inoreder array ?....
        //may be a inorder array is not required here as we are operating on 
        // undireactional graph so it doesn't matter that which node comes in which oreder
        //but here it matters that, we have to start from source node and all the way we 
        //reach to the each node

        //Prereques of Dijkstra :
        //1. Non-negative edge weights 
        //2. Weighted Graph Structure
        //3. Single Source Vertex
        

        //If there is a disconnected graph then the algo will conly calculate the min distance
        //from the source to the all connected components and all the distaces from 
        //disconnected components will remian at Infinity..

        //Step 2: build a priority queue to track the neighbours with thier adjecent traveling cost,
        //in kahn's algo we only put the nodes whic have inorder 0 to the priority Queue.
        // but here we will put all the neighbours for which (dis + weight < dist[adjNode])
        //it will help us to travel accordingly and get us a next node to travel as per the
        //min cost of traveling...


class Solution{
    public int[] dijkstra(int V, ArrayList<ArrayList<int [] >>adj , int S){

        int [] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[] > pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        dist[S]=0;
        pq.offer(new int[]{0,S}); //source node with dist =0;

        while(!pq.isEmpty()){
            int [] curr = pq.poll();
            int dis = curr[0]; //distance from source 
            int node = curr[1]; //node

            for(int[] edge : adj.get(node)){
                //now i am going to check and compare the each neighbour node and
                //1. Compare the diastance via this route as compared to the prev 
                //2. if less then update it

                int adjNode = edge[0];
                int weight = edge[1];

                if(dis + weight < dist[adjNode]){
                    dist[adjNode]= dis + weight;
                    pq.offer(new int [] { dist[adjNode], adjNode});
                }
                
                
            }
        }

        
        return dist;
    }
    
}         
