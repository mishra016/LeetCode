class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] output = new int[r][c];
        if(mat.length * mat[0].length != r*c){
            return mat;
        }
        int var =0;
        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[0].length;j++) {
                output[var/c][var%c] = mat[i][j];
                var++;
            }
        }
        return output;
    }
}