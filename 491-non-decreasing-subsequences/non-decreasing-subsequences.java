import java.util.*;

class Solution {
    private int n;

    public List<List<Integer>> findSubsequences(int[] nums) {
        n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, 0, curr, result);
        return result;
    }

    private void backtrack(int[] nums, int idx, List<Integer> curr, List<List<Integer>> result) {
        // If current subsequence has length ≥ 2, add to result
        if (curr.size() > 1) {
            result.add(new ArrayList<>(curr)); // deep copy
        }

        // To avoid duplicates at this recursion depth
        Set<Integer> used = new HashSet<>();

        for (int i = idx; i < n; i++) {
            // Include nums[i] if it keeps sequence non-decreasing
            // and is not already used at this level
            if ((curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1)) && !used.contains(nums[i])) {

                curr.add(nums[i]);
                backtrack(nums, i + 1, curr, result);
                curr.remove(curr.size() - 1);

                used.add(nums[i]); // mark used at this depth
            }
        }
    }
}
