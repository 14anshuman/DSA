class Solution {
    public int[] sumZero(int n) {
         int[] arr = new int[n];
        int index = 0;

        // Fill pairs (+x, -x)
        for (int i = 1; i <= n / 2; i++) {
            arr[index++] = i;
            arr[index++] = -i;
        }

        // If n is odd, add 0 in the middle
        if (n % 2 == 1) {
            arr[index] = 0;
        }

        return arr;
    }
}