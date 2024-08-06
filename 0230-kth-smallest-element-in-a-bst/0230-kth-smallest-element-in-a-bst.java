/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Create variable to hold kthNode
    int ans = 0, i = 0;
    public int kthSmallest(TreeNode root, int k) {
        // Call helper function on root
        inorder(root, k);
        // Return kthNode
        return ans;
        
    }
    // Create a helper function that processes in-order traversal while reducing k to help identify kth node
    public void inorder(TreeNode root, int k) {
        //  Base Case: Check if the tree is empty or k is less than 0. If it is, return. We have completed search.
        if(root == null || k < 0) {
            return;
        }
        
        // Call helper on left child
        inorder(root.left, k);

        // Reduce k and check if k is 0, if so set kth node and return
        i++;
        if(k==i){
            ans = root.val; 
            return;  
        }

        // Call helper on right child
        inorder(root.right, k);
    }
}