class Solution {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;

        }

        return nums;
        
    }
}

// class Solution {
//     public int[] numberGame(int[] nums) {

//         Arrays.sort(nums);

//         int[] arr = new int[nums.length];

//         for(int i=0; i<nums.length; i++){
//             if(i%2 != 0){
//                 arr[i-1] = nums[i];
//             }
//             else{
//                 arr[i+1] = nums[i];
//             }
//         }

//         return arr;
        
//     }
// }