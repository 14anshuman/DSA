class Solution {
    public boolean stoneGame(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];

        // Base case: subarrays of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        // Build for longer subarrays
        for (int len = 2; len <= n; len++) {
            for (int l = 0; l <= n - len; l++) {
                int r = l + len - 1;

                int pickLeft = nums[l] - dp[l + 1][r];
                int pickRight = nums[r] - dp[l][r - 1];

                dp[l][r] = Math.max(pickLeft, pickRight);
            }
        }

        return dp[0][n - 1] >= 0;
    }
}