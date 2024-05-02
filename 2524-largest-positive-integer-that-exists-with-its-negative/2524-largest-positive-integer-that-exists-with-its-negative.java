class Solution {
    public int findMaxK(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int result = -1;

        for(int num: nums){
            if(num > result && set.contains(-num)){
                result = num;
            }
        }

        return result;

    }
}


// TC: O(n^2)
// class Solution {
//     public int findMaxK(int[] nums) {

//         int result = -1;

//         for(int i:nums){
//             for(int j: nums){
//                 if(i == -j){
//                     result = Math.max(result, Math.abs(j));
//                 }
//             }
//         }
//         return result;
//     }
// }