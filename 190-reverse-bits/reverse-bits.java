class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Get the last bit of n
            int bit = n & 1;
            // Shift result left and add this bit
            result = (result << 1) | bit;
            // Shift n right for next bit
            n >>= 1;
        }

        return result;
    }
}