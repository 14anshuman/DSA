class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root);
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;

        // If current node is even, add all grandchildren
        if (root.val % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null) sum += root.left.left.val;
                if (root.left.right != null) sum += root.left.right.val;
            }
            if (root.right != null) {
                if (root.right.left != null) sum += root.right.left.val;
                if (root.right.right != null) sum += root.right.right.val;
            }
        }

        // Recur for left and right subtrees
        sum += helper(root.left);
        sum += helper(root.right);

        return sum;
    }
}
