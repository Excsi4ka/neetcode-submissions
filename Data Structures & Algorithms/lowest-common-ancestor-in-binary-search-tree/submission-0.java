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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode smallerNode = p.val < q.val ? p : q;
        TreeNode largerNode = p.val < q.val ? q : p;
        while (root != null) {
            if (smallerNode.val <= root.val && largerNode.val >= root.val)
                return root;
            if (smallerNode.val < root.val && largerNode.val <= root.val)
                root = root.left;
            else 
                root = root.right;
        }
        return root;
    }
}
