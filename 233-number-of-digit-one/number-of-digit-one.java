class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long p = 1; // position value (1,10,100..)
        
        while (p <= n) {
            long high = n / (p * 10);
            long curr = (n / p) % 10;
            long low = n % p;
            
            if (curr == 0) count += high * p;
            else if (curr == 1) count += high * p + (low + 1);
            else count += (high + 1) * p;
            
            p *= 10;
        }
        
        return count;
    }
}