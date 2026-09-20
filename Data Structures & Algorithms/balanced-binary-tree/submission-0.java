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
    public boolean isBalanced(TreeNode root) {
        int[] dif = new int[]{0};
        balancedDfs(root, dif);
        return dif[0] <= 1;
    }

    public int balancedDfs(TreeNode node, int[] dif) {
        if(node == null) return 0;
        int lH = balancedDfs(node.left, dif);
        int rH = balancedDfs(node.right, dif);
        int difference = Math.abs(lH-rH);
        if(difference > dif[0])
        dif[0] = difference;
        return Math.max(lH, rH) + 1;

    }
}
