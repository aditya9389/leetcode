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
    public List<Integer> postorderTraversal(TreeNode root) {
     Stack<TreeNode> st=new Stack<>();
        List<Integer> res= new LinkedList<>();
        if(root==null)
        return res;
        // TreeNode curr= root;
        // while(!st.isEmpty()||curr!=null)
        // {
        //     while(curr!=null)
        //     {
        //         st.push(curr);
        //         curr=curr.left;
        //     }
        //     curr= st.pop();
        //     res.add(curr.val);
        //     curr=curr.right;
        // }
         postorder(root,res);
        return res;
    }
    public static void postorder(TreeNode root,List<Integer> res)
    {
        if(root==null)
        return ;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
        return ;
    }
    //recusive apporach
}
//self done