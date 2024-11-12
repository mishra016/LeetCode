
class Solution {
//Greedy Approach: The idea behind this approach is that we try to "jump backwards" from the end of the array to the start. If we can reach the current "goal" from any position, we update the goal to that position and continue. If we can eventually set the goal to 0, it means we can reach the end. TC: O(N)
    public boolean canJump(int[] nums) {
        // Set the goal as the last index of the array
        int goal = nums.length - 1;

        // Traverse the array from the last index towards the first
        for (int i = nums.length - 1; i >= 0; i--) {
            // Check if we can jump from index `i` to the goal or beyond
            if (i + nums[i] >= goal) {
                // If we can, update the goal to the current index `i`
                goal = i;
            }
        }

        // If we end up at the first index (`goal == 0`), we can reach the end
        if (goal == 0) {
            return true;
        } else {
            return false;
        }
    }
}
