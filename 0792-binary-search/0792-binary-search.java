class Solution {
    public int search(int[] nums, int target) {

        //TC: O(logn)

        int start =0;
        int end = nums.length - 1;

        while(start<= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        return -1;
    }
}


// class Solution {
//     public int search(int[] nums, int target) {

//         //TC: O(N)
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//         }

//         return -1;
        
//     }
// }