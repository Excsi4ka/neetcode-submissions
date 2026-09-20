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

    HashSet<Integer> seen = new HashSet<>();

    public TreeNode invertTree(TreeNode root) {
        invertTreeRec(root);
        return root;
    }

    public void invertTreeRec(TreeNode node) {
if(node == null) return;
if(seen.contains(node.val)) return;
invertTreeRec(node.left);
invertTreeRec(node.right);
TreeNode r = node.right;
TreeNode l = node.left;
node.left = r;
node.right = l;
if(l != null) seen.add(l.val);
if(r != null) seen.add(r.val);
    }

}
