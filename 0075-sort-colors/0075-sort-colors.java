
class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;

        //one-pass --> Tc: O(n)
        int i=0;
        int j=0; 
        int k = n-1;

        while(j<=k){
            if(nums[j] == 1){
                j++;
            }
            else if(nums[j] == 2){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            }
            else{ //nums[j] == 0
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;

            }
        }
        
        
    }
}


// class Solution {
//     public void sortColors(int[] nums) {
//         //merge/quick sort gives --> TC:O(nlogn)

//         //traverse and count --> Tc: O(n)
//         int zeros=0, ones=0, twos = 0;

//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==0){
//                 zeros++;
//             }
//             else if(nums[i]==1){
//                 ones++;
//             }
//             else{
//                 twos++;
//             }
//         }

//         for(int i=0; i<nums.length; i++){
//             if(zeros > 0){
//                 nums[i] = 0;
//                 zeros--;
//             }else if(ones > 0){
//                 nums[i] = 1;
//                 ones--;
//             }else if(twos > 0){
//                 nums[i] = 2;
//                 twos--;
//             }
//         } 

        
        
//     }
// }




// class Solution {
//     public void sortColors(int[] nums) {
//         //bubble sort --> TC: o(n^2)
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=0; j<nums.length-1-i; j++){
//                 if(nums[j] > nums[j+1]){
//                     int temp = nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = temp;

//                 }

//             }
//         }
        
//     }
// }