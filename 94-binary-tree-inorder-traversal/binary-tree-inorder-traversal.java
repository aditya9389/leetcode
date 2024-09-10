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
 import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> res= new LinkedList<>();
        if(root==null)
        return res;
        TreeNode curr= root;
        while(!st.isEmpty()||curr!=null)
        {
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            curr= st.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
}