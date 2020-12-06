/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // terminator
        if (root == p || root == q || root == null) {
            return root;
        }

        // drill down
        TreeNode leftLowest = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLowest = lowestCommonAncestor(root.right, p, q);

        // result
        if (leftLowest != null && rightLowest != null) {
            return root;
        }

        if (leftLowest == null) {
            return rightLowest;
        }
        return leftLowest;
    }
}
// @lc code=end

