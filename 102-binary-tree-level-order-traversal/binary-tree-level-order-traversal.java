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
        Queue<TreeNode> que= new LinkedList<>();
        List<List<Integer>> res= new LinkedList<>();
        if(root==null)
        return res;
        que.add(root);
        while(!que.isEmpty())
        {
            List<Integer> level=new LinkedList<>();
            int qsize=que.size();
            for(int i=0;i<qsize;i++)
            {//this loop to put nodes levelwise...
            TreeNode temp= que.poll();
            if(temp.left!=null)que.add(temp.left);
            if(temp.right!=null)que.add(temp.right);
            level.add(temp.val);
            }
            res.add(level);
            
        }
        return res;

    }
}
//self done