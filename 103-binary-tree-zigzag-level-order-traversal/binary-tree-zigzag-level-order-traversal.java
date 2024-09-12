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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> que=new LinkedList<>();
        boolean ltor=true;
        que.add(root);
        while(!que.isEmpty())
        {
            int sizeque=que.size();
            List<Integer> row= new ArrayList<>();
            for(int i=0;i<sizeque;i++)
            {
                TreeNode temp= que.poll();
                row.add(temp.val);
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }
            if(!ltor)
            Collections.reverse(row);
            ltor=!ltor;
            res.add(row);
        }
        return res;
    }
}