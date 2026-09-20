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

    public int diameterOfBinaryTree(TreeNode root) {
        HashMap<TreeNode,Integer> map = new HashMap<>();
        diamAtN(root, map);
        int largest = 0;
        for(int i : map.values())
        if(i>largest) largest = i;
        return largest;
        
    }

    public int diamAtN(TreeNode node, HashMap<TreeNode,Integer> map) {
        if(node == null) return 0;
        int leftH = diamAtN(node.left, map);
        int rightH = diamAtN(node.right, map);
        map.put(node, leftH + rightH);
        return Math.max(leftH, rightH) + 1;

    }
}
