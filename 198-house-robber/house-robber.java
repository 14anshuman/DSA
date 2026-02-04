class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (nums == null || nums.length == 0)
            return 0;

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        return maxRobAtMemo(nums.length-1,nums,dp);

    }
    private int maxRobAtMemo(int index, int[] nums, int[] dp) {
        // TC : O(n)
        // SC : O(n)
        // base case
        
        if (index < 0)
            return 0;

        if (dp[index] != -1)
            return dp[index];

        // Option 1: rob current house and skip adjacent
        // Option 2: skip current house
        int pick = nums[index] + maxRobAtMemo(index - 2, nums, dp); // why -2 because it is mentioned that we need to pick non-adjacent elements 
        int notPick = maxRobAtMemo(index - 1, nums, dp);

        return dp[index] = Math.max(pick, notPick);

    }
}