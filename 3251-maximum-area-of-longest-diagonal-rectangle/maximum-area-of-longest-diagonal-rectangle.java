class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int l = rect[0];
            int w = rect[1];
            double diagonal = Math.sqrt(l * l + w * w);
            int area = l * w;

            if (diagonal > maxDiagonal || 
               (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        return maxArea;
    }
}
