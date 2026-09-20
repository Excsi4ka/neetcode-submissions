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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] ans = new boolean[]{true};
        doDfs(p, q, ans);
        return ans[0];
        
    }

    public void doDfs(TreeNode p, TreeNode q, boolean[] ans) {
        if(p == null && q != null) {ans[0] = false;
       return;
        }

        if(p != null && q == null) {ans[0] = false;
        return;
        }
        if(p == null && q == null) return;
        if(p.val != q.val) {
            ans[0] = false;
            return;
        }
        doDfs(p.left, q.left, ans);
        doDfs(p.right, q.right, ans);
    }
}
