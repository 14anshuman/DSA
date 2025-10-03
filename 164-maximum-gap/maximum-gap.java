class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            ans=Math.max(ans,Math.abs(nums[i]-nums[i+1]));
        }
        return ans;
    }
}