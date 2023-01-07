class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int m=0; m<matrix.length; m++){
            for(int n=0; n<matrix[0].length; n++){
                if(target == matrix[m][n]){
                    return true;
                }
            }
        }
        return false;
    }
}