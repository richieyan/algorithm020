/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

// @lc code=start
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
    private Map<Integer, Integer> rootMap;

    public TreeNode build(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft) {

        // terminator
        if (preLeft > preRight) {
            return null;
        }

        // prepare data
        int preRoot = preLeft;
        int inRoot = rootMap.get(preorder[preRoot]);

        // new root
        TreeNode root = new TreeNode(preorder[preRoot]);
        int leftSubTreeSize = inRoot - inLeft;

        root.left = build(preorder, inorder, preLeft + 1, preLeft + leftSubTreeSize, inLeft);
        root.right = build(preorder, inorder, preLeft + leftSubTreeSize + 1, preRight, inRoot + 1);

        // result
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        rootMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rootMap.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, n - 1, 0);
    }
}
// @lc code=end

