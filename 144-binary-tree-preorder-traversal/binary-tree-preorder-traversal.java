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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
        return new LinkedList<>();
        Stack<TreeNode> st= new Stack<>();
        List<Integer> res= new LinkedList<>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode temp=st.pop();
            res.add(temp.val);
            if(temp.right!=null)
            st.push(temp.right);
            if(temp.left!=null)
            st.push(temp.left);
            
        }
        return res;
    }
}