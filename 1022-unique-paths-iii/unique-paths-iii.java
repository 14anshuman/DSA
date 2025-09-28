class Solution {
    private int m, n;
    private int emptyCells;
    private int result;
    
    // Directions: down, up, right, left
    private final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        emptyCells = 0;
        result = 0;
        
        int startX = 0, startY = 0;
        
        // Count empty cells and find start cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    emptyCells++;
                } else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        
        // We need to walk over all empty cells plus the start cell
        emptyCells += 1;
        
        dfs(grid, 0, startX, startY);
        
        return result;
    }
    
    private void dfs(int[][] grid, int currCount, int i, int j) {
        // Boundary or obstacle check
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == -1) {
            return;
        }
        
        // If we reach the end cell
        if (grid[i][j] == 2) {
            if (currCount == emptyCells) {
                result++;
            }
            return;
        }
        
        // Mark the cell as visited
        int temp = grid[i][j];
        grid[i][j] = -1;
        
        // Explore all 4 directions
        for (int[] dir : directions) {
            dfs(grid, currCount + 1, i + dir[0], j + dir[1]);
        }
        
        // Backtrack
        grid[i][j] = temp;
    }
}
