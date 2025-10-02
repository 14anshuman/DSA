class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        // Add characters alternately while both strings have characters
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        // Add remaining characters from the longer string
        while (i < word1.length()) sb.append(word1.charAt(i++));
        while (j < word2.length()) sb.append(word2.charAt(j++));

        return sb.toString();
    }
}