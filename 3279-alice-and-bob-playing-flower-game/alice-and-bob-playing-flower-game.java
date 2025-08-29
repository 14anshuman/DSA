class Solution {
    public long flowerGame(int n, int m) {
        long res = 0;
        for (int i = 0; i < m; i++) {
            res += n;
        }
        return res/2;
    }
}