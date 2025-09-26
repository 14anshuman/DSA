class Solution {
    public int tribonacci(int n) {
        int[] memo = new int[38];
        Arrays.fill(memo, -1);
        return solve(n, memo);
    }

    public int solve(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        return memo[n] = solve(n - 1, memo) + solve(n - 2, memo) + solve(n - 3, memo);
    }
}