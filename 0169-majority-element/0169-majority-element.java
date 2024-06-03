//Follow-Up using Boyer-Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int votes = 0;

        for(int num: nums){
            if(votes == 0){
                candidate = num;
            }
            if(num == candidate){
                votes++;
            }else{
                votes--;
            }
        }

        return candidate;
        
    }
}

// ----------------------------------------------------------------------

// //HashMap
// class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int num: nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if(map.get(num) > (nums.length/2))
//             return num;
//         }

//         return 0; // will never reach
        
//     }
// }


// ----------------------------------------------------------------------

// //Sorting
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
        
//     }
// }