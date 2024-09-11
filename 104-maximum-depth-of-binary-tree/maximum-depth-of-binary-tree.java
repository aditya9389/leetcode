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
    public int maxDepth(TreeNode root) {
        int res=0;
        if(root==null)
        return res;
        res=height(root);
        return res;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        return 0;
        int maxl=height(root.left);
        int maxr=height(root.right);
        return 1+Math.max(maxr,maxl);
    }
}
//can be done through level order treaversal too but this one simple 