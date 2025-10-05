class Solution {
    public int maxProduct(int[] nums) {
        int front = 1, back = 1;
        int prod = nums[0];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            front *= nums[i];
            prod = Math.max(prod, front);
            if (front == 0) front = 1;

            back *= nums[n - 1 - i];
            prod = Math.max(prod, back);
            if (back == 0) back = 1;
        }

        return prod;
    }
}