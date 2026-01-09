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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ArrayList<Long> t = new ArrayList<>();
        while (!q.isEmpty()) {
            long s = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                s += temp.val;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            t.add(s);
        }
        if (k > t.size())
            return -1;
        Collections.sort(t); 
        return t.get(t.size() - k);
    }
}