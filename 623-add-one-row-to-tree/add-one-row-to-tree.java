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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
            return new TreeNode(val, root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;

        queue.offer(root);

        while(!queue.isEmpty() && depth > level) {
            int size = queue.size();

            for(int i = 0; i < size; ++i) {
                TreeNode curr = queue.poll();

                if(depth - 1 == level) {
                    curr.left = new TreeNode(val, curr.left, null);
                    curr.right = new TreeNode(val, null, curr.right);
                } else {
                    if(curr.left != null)
                        queue.offer(curr.left);

                    if(curr.right != null)
                        queue.offer(curr.right);
                }
            }

            level++;
        }

        return root;
    }
}
//learn graph then do it bfs didnt even read
