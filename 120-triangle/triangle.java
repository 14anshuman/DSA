class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] memo = new Integer[n][n]; // memoization table
        return dfs(triangle, 0, 0, memo);
    }

    private int dfs(List<List<Integer>> triangle, int row, int col, Integer[][] memo) {
        // Base case: last row
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        // If already computed, return from memo
        if (memo[row][col] != null) {
            return memo[row][col];
        }

        // Recursive choice: go down or down-right
        int down = dfs(triangle, row + 1, col, memo);
        int diag = dfs(triangle, row + 1, col + 1, memo);

        // Store result in memo
        memo[row][col] = triangle.get(row).get(col) + Math.min(down, diag);

        return memo[row][col];
    }
}
