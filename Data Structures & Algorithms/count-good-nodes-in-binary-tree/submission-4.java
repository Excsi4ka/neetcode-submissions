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
    public int goodNodes(TreeNode root) {
        Counter counter = new Counter(0);
        dfs(root, counter, root.val);
        return counter.num; 
    }

    public void dfs(TreeNode root, Counter counter, int largest) {
        if (root == null)
           return;
        if (root.val >= largest) {
            largest = root.val;
            counter.num++;
        }
        dfs(root.left, counter, largest);
        dfs(root.right, counter, largest);
    }

    public static class Counter {

        public int num;

        public Counter(int initial) {
            num = initial;
        }

    }
}
