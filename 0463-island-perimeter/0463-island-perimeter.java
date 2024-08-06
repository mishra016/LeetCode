
// dfs
class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int perimeter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    perimeter += dfs(i, j, grid, vis);
                }
            }
        }
        return perimeter;
    }

    private int dfs(int row, int col, int[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] = true;

        int perimeter = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
 
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m || grid[newRow][newCol] == 0) {
                // If the neighbor is out of bounds or water, it contributes to the perimeter
                perimeter++;
            } else if (!vis[newRow][newCol] && grid[newRow][newCol] == 1) {
                // Recursively visit unvisited neighboring land cells
                perimeter += dfs(newRow, newCol, grid, vis);
            }
        }

        return perimeter;
    }
}