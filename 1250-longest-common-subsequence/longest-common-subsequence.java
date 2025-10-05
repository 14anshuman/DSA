class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int i=n-1,j=m-1;
        int[][] dp=new int[n][m];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        return lcs(text1,text2,n,m,dp,i,j);
    }
    public int lcs(String text1,String text2,int n,int m,int[][] dp,int i,int j){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+lcs(text1,text2,n,m,dp,i-1,j-1);
        }
        else{
                     return dp[i][j]=Math.max(lcs(text1,text2,n,m,dp,i-1,j),lcs(text1,text2,n,m,dp,i,j-1));
        }

    }
}