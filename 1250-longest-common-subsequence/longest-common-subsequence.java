class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        return helper(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
    public int helper(String s,String t, int i,int j,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=1+helper(s,t,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(helper(s,t,i-1,j,dp),helper(s,t,i,j-1,dp));
    }
}