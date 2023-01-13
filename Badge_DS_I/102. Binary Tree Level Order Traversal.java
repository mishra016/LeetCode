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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return arr;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int currLength = queue.size();
            arr.add(new ArrayList<>());
            while (currLength > 0) {
				TreeNode prev = queue.poll();
				currLength--;
				arr.get(arr.size() - 1).add(prev.val);
				if (prev.left != null) {
					queue.add(prev.left);
				}
				if (prev.right != null) {
					queue.add(prev.right);
				}
			}
        }
        return arr;
    }
}