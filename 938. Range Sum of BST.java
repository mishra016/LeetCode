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
    int ans = 0, high, low;
    public void inorder(TreeNode root){
        if(root!= null){
            inorder(root.left);
            if(root.val >=low && root.val<=high){
                ans+= root.val;
            }
            inorder(root.right);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        inorder(root);
        return ans;
    }
}