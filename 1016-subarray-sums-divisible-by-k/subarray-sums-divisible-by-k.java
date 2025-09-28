class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         HashMap<Integer, Integer> remainderCount = new HashMap<>();
    remainderCount.put(0, 1); // remainder 0 seen once (empty prefix)

    int prefixSum = 0;
    int count = 0;

    for (int num : nums) {
        prefixSum += num;

        // normalize remainder to handle negatives
        int remainder = ((prefixSum % k) + k) % k;

        // if remainder seen before, add its count
        count += remainderCount.getOrDefault(remainder, 0);

        // increment remainder frequency
        remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
    }

    return count;
    }
}