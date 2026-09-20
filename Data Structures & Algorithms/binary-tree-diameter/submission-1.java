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

    static class Holder {
        public int val = 0;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Holder largest = new Holder();
        diamAtN(root, largest);
        return largest.val;
        
    }

    public int diamAtN(TreeNode node, Holder i) {
        if(node == null) return 0;
        int leftH = diamAtN(node.left, i);
        int rightH = diamAtN(node.right, i);
        if(leftH + rightH > i.val)
        i.val = leftH+rightH;
    
        return Math.max(leftH, rightH) + 1;

    }
}
