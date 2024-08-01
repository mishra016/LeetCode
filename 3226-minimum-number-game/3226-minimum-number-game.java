class Solution {
    public int[] numberGame(int[] nums) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] arr = new int[nums.length];

        for(int num:nums){
            minHeap.add(num);
        }

        int index = 0;

        while(!minHeap.isEmpty()){

            int alice = minHeap.poll();
            int bob = minHeap.poll();

            arr[index++] = bob;
            arr[index++] = alice;
        }

        return arr;
        
    }
}


// -------------------------------------------------------

// class Solution {
//     public int[] numberGame(int[] nums) {

//         Arrays.sort(nums);

//         for(int i=0; i<nums.length-1; i+=2){
//             int temp = nums[i];
//             nums[i] = nums[i+1];
//             nums[i+1] = temp;

//         }

//         return nums;
        
//     }
// }


//------------------------------------------------------

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