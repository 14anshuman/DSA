class Solution {
    public int gcdOfOddEvenSums(int n) {
         int oddSum = n * n;         // sum of first n odd numbers
        int evenSum = n * (n + 1);
        return gcd(oddSum,evenSum);


        
    }
    int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}