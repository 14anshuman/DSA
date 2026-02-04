class Solution {
   public int subarrayGCD(int[] nums, int k) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			int currGcd = nums[i];

			for (int j = i; j < nums.length; j++) {

				currGcd = gcd(currGcd, nums[j]);

				if (currGcd == k)
					count++;
				else if (currGcd < k) {
					break;
				}

			}
		}
		return count;
	}

	public int gcd(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}