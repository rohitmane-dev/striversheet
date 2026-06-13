import java.util.*;

// // Compute indegrees

// Push all indegree 0 nodes into queue

// While queue not empty:

//     remove node

//     add to answer

//     remove its outgoing edges

//     if neighbour indegree becomes 0:
//         push into queue

class KahnAlgo{ //bfs based topological sort
    public static void main(String [] args){


        //Step 1: Build the graph and indegree array
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<6;i++){
            adj.add(new ArrayList<Integer>());
        }


        int []indegree = new int[6];

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);

        for(int i=0;i<6;i++){
            for(int j:adj.get(i)){
                indegree[j]++;
            }
        }

        //Step 2: Now let's Build a queue of all vertices with indegree 0
        //this will help us to g=find the independent nodes or they can act 
        //like asource node for give graph

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<6;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        //Step 3: Now let's do the topological sort
        while(!q.isEmpty()){
            int node = q.poll();

            //for course scheduling priblem you can add the count for each polll from queue
            //and check if the count is equal to the number of courses or not

            System.out.print(node+" ");
            for(int j:adj.get(node)){
                indegree[j]--;
                if(indegree[j] == 0){
                    q.add(j);
                }
            }
        }




    }
}