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
    public int maxPathSum(TreeNode root) {
        int sum[]={Integer.MIN_VALUE};
        if(root==null)
        return 0;
        int maxsum=0;
        maxsum=height(root,sum);
        return sum[0];
    }
    public int height(TreeNode root,int[] sum)
    {
        if(root==null)
        return 0;
        int maxl=Math.max(0,height(root.left,sum));
        int maxr=Math.max(0,height(root.right,sum));
        sum[0]=Math.max(sum[0],maxl+maxr+root.val);
        return root.val+Math.max(maxr,maxl);
    }
}