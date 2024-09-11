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
        int dia[]= {0};
        if(root==null)
        return dia[0];
        //int ans=height(root,dia);
        maxdia(root,dia);
        return dia[0];
    }
    public int height(TreeNode root,int[] dia)
    {
        if(root==null)
        return 0;
        int maxl=height(root.left,dia);
        int maxr=height(root.right,dia);

        dia[0]=Math.max(dia[0],maxl+maxr);
        return 1+Math.max(maxr,maxl);
    }
    public void maxdia(TreeNode root,int[] dia)
    {//naive,,,o(n^2)..very bad
        if(root==null)
        return ;
        int maxl=height(root.left,dia);
        int maxr=height(root.right,dia);
        dia[0]=Math.max(dia[0],maxl+maxr);
        maxdia(root.left,dia);
        maxdia(root.right,dia);
    }
}
//self done

