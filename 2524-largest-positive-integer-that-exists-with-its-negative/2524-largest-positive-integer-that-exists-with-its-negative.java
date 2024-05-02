class Solution {
    public int findMaxK(int[] nums) {

        int result = -1;

        for(int i:nums){
            for(int j: nums){
                if(i == -j){
                    result = Math.max(result, Math.abs(j));
                }
            }
        }
        return result;
    }
}