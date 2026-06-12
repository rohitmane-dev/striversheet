import java.util.*;

class cycleDetectionBFS {
    public static void main(String[] args) {
        // Example input:
        int A = 5; // number of nodes (1-based indexing)
        int[][] B = {
            {1, 2},
            {2, 3},
            {4, 5}
        };

        Solution sol = new Solution();
        int result = sol.solve(A, B);

        System.out.println("Number of connected components: " + result);
    }
}

class Solution {
    public int solve(int A, int[][] B) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= A; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < B.length; i++) {
            int u = B[i][0];
            int v = B[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Step 2: Visited array
        boolean[] visited = new boolean[A + 1];
        int components = 0;

        // Step 3: BFS for each unvisited node
        for (int i = 1; i <= A; i++) {
            if (!visited[i]) {
                components++;
                bfs(i, graph, visited);
            }
        }

        return components;
    }

    private void bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nei : graph.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }
}
