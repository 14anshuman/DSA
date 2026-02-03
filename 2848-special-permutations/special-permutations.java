class Solution {
   Map<Long, Integer> cache;
int MOD = 1000000007;
public int specialPerm(int[] nums) {
    int n = nums.length;
    cache = new HashMap<>();
    return dfs(1, 0, nums);
}
private int dfs(int prev, int mask, int[] nums) {
    if (mask == (1 << nums.length) - 1) return 1;
    long key = (long) prev << 20 | mask;
    if (cache.containsKey(key)) return cache.get(key);

    int count = 0;
    for (int i = 0; i < nums.length; i++)
        if ((mask & (1 << i)) == 0 && (nums[i] % prev == 0 || prev % nums[i] == 0))
            count = (count + dfs(nums[i], mask | (1 << i), nums)) % MOD;
    cache.put(key, count);
    return count;
}
}