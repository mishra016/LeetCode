class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int mx = nums[0]; // Initialize max sum to the first element
        int sum = 0;      // Initialize the current subarray sum to 0

        // Iterate through each element in the array
        for(int i = 0; i < n; i++) {
            // If the current sum is negative, reset it to 0 to start fresh
            if (sum < 0) {
                sum = 0;
            }

            // Add the current element to the sum
            sum += nums[i];

            // Update the maximum sum found so far
            mx = Math.max(mx, sum);
        }

        return mx; // Return the maximum subarray sum
    }
}
