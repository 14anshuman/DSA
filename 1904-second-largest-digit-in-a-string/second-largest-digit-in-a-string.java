class Solution {
    public int secondHighest(String s) {
        int first = -1;   // largest digit
        int second = -1;  // second largest digit
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int d = c - '0';  // convert char to digit
                
                if (d > first) {
                    // Shift first to second
                    second = first;
                    first = d;
                } else if (d < first && d > second) {
                    // Update second largest
                    second = d;
                }
            }
        }
        
        return second;
    }
}