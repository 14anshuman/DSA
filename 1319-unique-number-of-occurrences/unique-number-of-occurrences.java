class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store frequencies in a set
        HashSet<Integer> freqSet = new HashSet<>(freq.values());

        // Step 3: Compare sizes
        return freqSet.size() == freq.size();
    }
}