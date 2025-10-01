class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int []ans=new int[r+1];
        for(int right=r;right>=0;right--){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
            if(rs>ls){
                ans[right]=rs;
                r--;
            }else{
                ans[right]=ls;
                l++;
            }
        }
        return ans;
    }
}