/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        visit(root, list);
        return list;
    }

    public void visit(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.children == null) {
            return;
        }
        for (Node n : node.children) {
            visit(n, list);
        }
    }
}
// @lc code=end

