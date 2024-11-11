class Solution {
    int Rows, Cols;
    boolean pacific, atlantic;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Rows = heights.length;
        Cols = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();

        for (int r = 0; r < Rows; r++) {
            for (int c = 0; c < Cols; c++) {
                pacific = false;
                atlantic = false;
                dfs(heights, r, c, Integer.MAX_VALUE);
                if (pacific && atlantic) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }
        return res;
        
    }

    private void dfs(int[][] heights, int r, int c, int prev){
        if(r<0 || c<0){
            pacific = true;
            return;
        }

        if(r >= Rows || c>= Cols){
            atlantic = true;
            return;
        }
        if(heights[r][c] > prev){
            return;
        }

        int temp = heights[r][c];
        heights[r][c] = Integer.MAX_VALUE;
        for (int[] dir : directions) {
            dfs(heights, r + dir[0], c + dir[1], temp);
            if (pacific && atlantic) {
                break;
            }
        }
        heights[r][c] = temp;
    }
}