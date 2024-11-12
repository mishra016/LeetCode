public class Solution {
    // A list to store all the valid combinations that sum up to the target
    List<List<Integer>> res;

    // Main method to find all combinations that sum to the target
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        // Initialize the result list to store combinations
        res = new ArrayList<List<Integer>>();
        // List to store the current combination being explored
        List<Integer> cur = new ArrayList();
        
        // Call the backtrack helper method to explore all combinations
        backtrack(nums, target, cur, 0);
        
        // Return the result list containing all valid combinations
        return res;
    }

    // Helper method to explore all possible combinations recursively
    public void backtrack(int[] nums, int target, List<Integer> cur, int i) {
        // Base case: If the target becomes 0, it means we found a valid combination
        if (target == 0) {
            // Add the current combination to the result list
            res.add(new ArrayList(cur));
            return;
        }
        
        // If the target becomes negative, or we've exhausted all elements, stop the search
        if (target < 0 || i >= nums.length) {
            return;
        }

        // Choose the current element (nums[i]) and continue to explore further with the reduced target
        cur.add(nums[i]);
        // Explore the next steps with the same index (i) to allow repetition of the current number
        backtrack(nums, target - nums[i], cur, i);
        
        // Backtrack: Remove the last element to explore the next possibilities
        cur.remove(cur.size() - 1);
        
        // Explore the next element by incrementing the index `i`
        backtrack(nums, target, cur, i + 1);
    }
}
