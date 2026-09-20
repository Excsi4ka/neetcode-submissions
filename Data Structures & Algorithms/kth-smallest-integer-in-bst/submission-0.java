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
    public int kthSmallest(TreeNode root, int k) {
        int[] data = {0, 0};
        dfs(root, data, k);
        return data[1];
    }

    public void dfs(TreeNode node, int[] data, int k) {
        if (node == null)
            return;

        dfs(node.left, data, k);
        if (++data[0] == k) {
            data[1] = node.val;
            return;
        }
        dfs(node.right, data, k);
    }
}
