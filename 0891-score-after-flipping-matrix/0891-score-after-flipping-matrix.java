class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //Set first Column for each Row to 1
        for(int i=0; i<m; i++){
            if(grid[i][0] == 0){

                //Flip it
                for(int j=0; j<n; j++){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        for(int j=1; j<n; j++){
            //Count zeros in each col
            int countZeros = 0;

            for(int i=0; i<m; i++){
                if(grid[i][j] == 0){
                    countZeros++;
                }
            }

            int countOnes = m - countZeros;

            if(countZeros > countOnes){
                //flip that col
                for(int i=0; i<m; i++){
                    grid[i][j] = 1- grid[i][j];
                }
                
            }
        }

        int score = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int val = (int)Math.pow(2, n-j-1) * grid[i][j];
                score = score + val;
            }
        }

        return score;
        
    }
}