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
        TreeNode curr= root;
        TreeNode lastv=null;
        while(!st.isEmpty()||curr!=null)
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            else
            {
                TreeNode peeknode= st.peek();
                if(peeknode.right!=null&&lastv!=peeknode.right)
                curr=(peeknode.right);
                else{
                        res.add(peeknode.val);
                        lastv=st.pop();
                }
            }
        }
        //postorder(root,res);
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