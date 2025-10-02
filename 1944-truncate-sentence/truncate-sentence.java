class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k && i < words.length; i++) {
            if (i > 0)
                ans.append(" "); // add space before each word except the first
            ans.append(words[i]);
        }

        return ans.toString();
    }
}