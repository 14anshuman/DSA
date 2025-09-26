class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] memo = new Integer[n][n];
        return scoreDiff(nums, 0, n - 1, memo) >= 0;
    }

    private int scoreDiff(int[] nums, int l, int r, Integer[][] memo) {
        if (l == r) return nums[l];
        if (memo[l][r] != null) return memo[l][r];

        int pickLeft  = nums[l] - scoreDiff(nums, l + 1, r, memo);
        int pickRight = nums[r] - scoreDiff(nums, l, r - 1, memo);

        return memo[l][r] = Math.max(pickLeft, pickRight);
    }
}
