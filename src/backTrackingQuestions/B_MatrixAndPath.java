package backTrackingQuestions;

import java.util.Arrays;

public class B_MatrixAndPath {

    static void path(String p, int r, int c, int[][] path,
                     int step, boolean[][] maze) {

        // Destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {

            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println("Path: " + p);
            System.out.println();

            return;
        }

        // Cannot move through false cell
        if (!maze[r][c]) {
            return;
        }

        // Mark current cell as visited
        maze[r][c] = false;
        path[r][c] = step;

        // Up
        if (r > 0) {
            path(p + 'U', r - 1, c, path, step + 1, maze);
        }

        // Down
        if (r < maze.length - 1) {
            path(p + 'D', r + 1, c, path, step + 1, maze);
        }

        // Right
        if (c < maze[0].length - 1) {
            path(p + 'R', r, c + 1, path, step + 1, maze);
        }

        // Left
        if (c > 0) {
            path(p + 'L', r, c - 1, path, step + 1, maze);
        }

        // BACKTRACK
        maze[r][c] = true;
        path[r][c] = 0;
    }

    public static void main(String[] args) {

        boolean[][] maze = {
            {true,  true,  true},
            {true,  false, true},
            {true,  true,  true}
        };

        int[][] path = new int[maze.length][maze[0].length];

        path("", 0, 0, path, 0, maze);
    }
}