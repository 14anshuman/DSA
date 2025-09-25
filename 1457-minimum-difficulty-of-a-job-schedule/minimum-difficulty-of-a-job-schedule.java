class Solution {
    Integer[][] memo;

    public int minDifficulty(int[] j, int d) {
        if (j.length < d) return -1;
        memo = new Integer[j.length][d + 1];
        return helper(j, d, 0);
    }

    public int helper(int[] j, int d, int idx) {
        if (d == 1) {
            int maxi = j[idx];
            for (int i = idx; i < j.length; i++) {
                maxi = Math.max(maxi, j[i]);
            }
            return maxi;
        }

        if (memo[idx][d] != null) return memo[idx][d];

        int maxD = j[idx];
        int finalR = Integer.MAX_VALUE;

        // partition job array
        for (int i = idx; i <= j.length - d; i++) {
            maxD = Math.max(maxD, j[i]);
            int result = maxD + helper(j, d - 1, i + 1);
            finalR = Math.min(result, finalR);
        }

        return memo[idx][d] = finalR;
    }
}
