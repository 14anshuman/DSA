class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()>s.length()){
            return false;
        }
        String f="";
        int j=0;
        for(int i=0;i<words.size();i++){
           String a= words.get(i);
           f+=a.charAt(j);
        }
        return f.equals(s);
    }
}