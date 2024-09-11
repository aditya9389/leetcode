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
    //  Stack<TreeNode> st=new Stack<>();      //this one is for 1 stack and is best
    //     List<Integer> res= new LinkedList<>();
    //     if(root==null)
    //     return res;
    //     TreeNode curr= root;
    //     TreeNode lastv=null;
    //     while(!st.isEmpty()||curr!=null)
    //     {
    //         if(curr!=null)
    //         {
    //             st.push(curr);
    //             curr=curr.left;
    //         }
    //         else
    //         {
    //             TreeNode peeknode= st.peek();
    //             if(peeknode.right!=null&&lastv!=peeknode.right)
    //             curr=(peeknode.right);
    //             else{
    //                     res.add(peeknode.val);
    //                     lastv=st.pop();
    //             }
    //         }
    //     }
        Stack<TreeNode> st1=new Stack<>();      //this one is for 2 stack
        Stack<TreeNode> st2= new Stack<>();
        List<Integer> res= new LinkedList<>();
        if(root==null)
        return res;
        st1.push(root);
        while(!st1.isEmpty())
        {
            TreeNode temp= st1.pop();
            st2.push(temp);
            if(temp.left!=null)st1.push(temp.left);
            if(temp.right!=null)st1.push(temp.right);
        }
        while(!st2.isEmpty())
        res.add(st2.pop().val);
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