import java.util.*;

public class ratinmaze {

    public static boolean isSafe(int[][] maze, int x, int y) {
        int n = maze.length;
        return (x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1);
    }

    public static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        int n = maze.length;

        // If destination is reached
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is a valid move
        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            // Move right
            if (solveMaze(maze, x, y + 1, sol))
                return true;

            // Move down
            if (solveMaze(maze, x + 1, y, sol))
                return true;

            // Backtrack
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void solution(int[][] maze) {
        int n = maze.length;
        int[][] sol = new int[n][n];

        if (solveMaze(maze, 0, 0, sol)) {
            System.out.println("Path found:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(sol[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("No path found.");
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 1}
        };

        solution(maze);
    }
}
