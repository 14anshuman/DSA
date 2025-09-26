import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int start = nums[i];

            // Move forward while the next number is consecutive
            while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            // If start != nums[i], it means we have a range
            if (start != nums[i]) {
                result.add(start + "->" + nums[i]);
            } else {
                // Single number
                result.add(String.valueOf(start));
            }
        }

        return result;
    }
}
