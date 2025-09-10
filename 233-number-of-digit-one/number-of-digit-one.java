class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1;  // start with ones place

        while (factor <= n) {
            long high = n / (factor * 10);
            long cur = (n / factor) % 10;
            long low = n % factor;

            if (cur == 0) {
                count += high * factor;
            } else if (cur == 1) {
                count += high * factor + low + 1;
            } else {
                count += (high + 1) * factor;
            }

            factor *= 10;
        }

        return count;
    }
}
