class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0, -1);   // base case: remainder 0 at index -1
        
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            int rem = sum % k;
            if (rem < 0) rem += k;   // handle negative k
            
            if (remainderIndex.containsKey(rem)) {
                int prevIndex = remainderIndex.get(rem);
                if (i - prevIndex >= 2) return true; // length ≥2
            } else {
                remainderIndex.put(rem, i); // store first occurrence
            }
        }
        
        return false;
    }
}