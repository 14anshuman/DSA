class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t=(int) target;

        for(int i=0;i<letters.length;i++){
            if(((int) letters[i]) >t){
                       return letters[i];
            }
        }
        return letters[0];
    }
}