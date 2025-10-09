class Solution {
    public int findMin(int[] nums) {
        int end=nums.length-1;
        int start=0;
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return nums[start];
    }
}