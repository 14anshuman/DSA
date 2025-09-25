class Solution {
    public int minFlipsMonoIncr(String s) {
         int count_of_ones = 0;
        int flips = 0;
        char[] q=s.toCharArray();
        
        for(char ch : q) {
            if(ch == '1')
                count_of_ones++;
            else {
                flips = Math.min(flips+1, count_of_ones);
            }
        }
        
        return flips;
    }
}