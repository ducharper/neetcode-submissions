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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        iohelper(root, result);
        return result;
    }

    private void iohelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        iohelper(root.left, result);
        result.add(root.val);
        iohelper(root.right, result);
    }
}