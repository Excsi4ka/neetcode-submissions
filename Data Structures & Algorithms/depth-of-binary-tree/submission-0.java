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

    int max;
    public int maxDepth(TreeNode root) {
        max = 0;
        depth(root, 1);
return max;
    }

 public void depth(TreeNode n, int height) {
    if(n == null) return;
    depth(n.left, height+1);
    if(height > max) max = height;

    depth (n.right, height+1);

 }
}
