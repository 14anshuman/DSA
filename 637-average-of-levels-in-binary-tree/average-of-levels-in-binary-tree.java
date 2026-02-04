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
    List<Double> ans=new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return ans;
        q.add(root);
        while (!q.isEmpty()){
            int n = q.size();
            double sum=0;
            for (int i =0; i< n ; i++){
                TreeNode front = q.remove();
                sum+=front.val;
                if (front.left != null) q.add(front.left);
                if (front.right != null) q.add(front.right);
            }
            ans.add(sum/n);
        
        }
        return ans;
    }
}