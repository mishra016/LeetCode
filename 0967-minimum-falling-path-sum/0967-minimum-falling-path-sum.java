public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;

        int[][] t = new int[m][m];

        //populate first row
        for(int col=0; col<m; col++){
            t[0][col] = matrix[0][col];
        }

        for (int row = 1; row < m; row++) {
            for (int col = 0; col < m; col++) {
                t[row][col] = matrix[row][col] + Math.min(
                        t[row - 1][col],
                        Math.min(t[row - 1][Math.max(0, col - 1)], t[row - 1][Math.min(m - 1, col + 1)])
                );
            }
        }

        // for (int row=1; row<m; row++) {
        //     for(int col=0; col<m; col++){

        //         //t[row-1][col-1] - out of bound if col=0
        //         //t[row-1][col]
        //         //t[row-1][col+1] - out of bound if col=m-1

        //         int a = Integer.MAX_VALUE;
        //         int b = Integer.MAX_VALUE;

        //         if(col-1 >=0){
        //             a = t[row-1][col-1];
        //         }
        //         if(col+1 < m){
        //             b = t[row-1][col-1];
        //         }

        //         t[row][col] = matrix[row][col] + Math.min(t[row-1][col], Math.min(a, b));
        //     }
        // }
        
        return Arrays.stream(t[m - 1]).min().orElse(0);
    }

}



// //DP
// public class Solution {
//     public int minFallingPathSum(int[][] A) {
//         int m = A.length; // row
//         int n = m; // column
//         int[][] t = new int[101][101];
//         for (int[] row : t) {
//             Arrays.fill(row, -1);
//         }
//         int result = Integer.MAX_VALUE;
//         for (int col = 0; col < n; col++) {
//             result = Math.min(result, MFS(A, 0, col, t));
//         }
//         return result;
//     }

//     private int MFS(int[][] A, int row, int col, int[][] t) {
//         if (row == A.length - 1)
//             return A[row][col];
//         if (t[row][col] != -1)
//             return t[row][col];

//         int minSum = Integer.MAX_VALUE;

//         for (int shift = -1; shift <= 1; shift++) {
//             if (col + shift >= 0 && col + shift < A[row].length) {
//                 minSum = Math.min(minSum, A[row][col] + MFS(A, row + 1, col + shift, t));
//             }
//         }

//         return t[row][col] = minSum;
//     }
// }
