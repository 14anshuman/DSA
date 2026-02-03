class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long[][] arr = new long[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
        }

        // Sort by nums
        Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));

        long totalCost = 0;
        for (long[] a : arr) totalCost += a[1];

        // Find weighted median
        long curr = 0;
        long target = 0;
        for (long[] a : arr) {
            curr += a[1];
            if (curr * 2 >= totalCost) {
                target = a[0];
                break;
            }
        }

        // Calculate minimum cost
        long ans = 0;
        for (long[] a : arr) {
            ans += Math.abs(a[0] - target) * a[1];
        }

        return ans;
    }
}
