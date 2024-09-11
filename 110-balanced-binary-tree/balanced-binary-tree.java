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
        if(root==null)
        return true;
        int res=height(root);
        return res>=0? true:false;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        return 0;
        int maxl=height(root.left);
        if(maxl==-1)
        return -1;
        int maxr=height(root.right);
        if(maxr==-1)
        return -1;
        if(Math.abs(maxl-maxr)>1) return -1;
        return 1+Math.max(maxr,maxl);
    }
}
//easy  and simple and self done