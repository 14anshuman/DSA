class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (x.length() > 0) x.deleteCharAt(x.length() - 1);
            } else {
                x.append(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (y.length() > 0) y.deleteCharAt(y.length() - 1);
            } else {
                y.append(ch);
            }
        }

        return x.toString().equals(y.toString());
    }
}
