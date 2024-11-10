class Solution {
    public void dfs(char[][] grid, int row, int col){
        //check boundary
        if(row<0 || col<0 || row >= grid.length || col >= grid[0].length|| grid[row][col] == '0'){
            return;
        }

        //mark cell as visited
        grid[row][col] = '0';

        //visit adj cells
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }

    public int numIslands(char[][] grid) {

        int numberIsland = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j] == '1'){
                    numberIsland++;
                    dfs(grid, i, j);
                }
            }
        }

        return numberIsland;
        
    }
}