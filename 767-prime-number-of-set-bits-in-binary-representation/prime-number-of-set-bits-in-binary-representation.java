class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        // Precomputed primes up to 32
        boolean[] prime = new boolean[33];
        prime[2] = prime[3] = prime[5] = prime[7] = true;
        prime[11] = prime[13] = prime[17] = prime[19] = true;
        prime[23] = prime[29] = prime[31] = true;

        for (int i = left; i <= right; i++) {
            if (prime[Integer.bitCount(i)]) {
                count++;
            }
        }
        return count;
    }
}