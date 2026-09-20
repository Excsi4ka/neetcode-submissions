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
        List<List<Integer>> list = new ArrayList();
        dfs(root, list, 0);
        return list;
    }

    public void dfs(TreeNode node, List<List<Integer>> list, int level) {
        if(node == null)
        return;
        if(list.size() < level + 1)
        list.add(new ArrayList<>());
        dfs(node.left, list, level+1);
        dfs(node.right, list, level+1);
        list.get(level).add(node.val);
    }
}
