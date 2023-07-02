class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
    
        for(int i=0; i<nums.length; i++){
            element_sum += nums[i];
            
            int val = nums[i];
            int digit;
             
            while(val>0){
                digit = val%10;
                digit_sum += digit;
                val = val/10;
            }
        }
        return Math.abs(element_sum - digit_sum);
    }
}