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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentNumber) {
        if (node == null) return 0;

        // update current number
        currentNumber = (currentNumber << 1) | node.val;

        // if leaf node, return current number
        if (node.left == null && node.right == null) {
            return currentNumber;
        }

        // recurse left and right
        return dfs(node.left, currentNumber) + dfs(node.right, currentNumber);
    }
}
