class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a=0; a*a<=c; a++){
            double b = Math.sqrt(c - a*a);
            if(b == (int)b){
                return true;
            }
        }

        return false;
    }
}


// class Solution {
//     public boolean judgeSquareSum(int c) {

//         for(long a=0; a*a<=c; a++){
//             for(long b=0; b*b<=c; b++){
//                 if(a*a + b*b == c){
//                     return true;
//                 }
//             }
//         }
//         return false;
        
//     }
// }