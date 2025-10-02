class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int sum=0;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
    
                sum+=mat[i][i];
                sum+=mat[m-1-i][i];
            
        }
        if(m%2==0){
            return sum;
        }
        return sum-(mat[m/2][m/2]);
        
    }
}