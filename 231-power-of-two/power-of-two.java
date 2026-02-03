class Solution {
    public boolean isPowerOfTwo(int n) {
         for(int i=0;i<=Math.sqrt(n+1);i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}