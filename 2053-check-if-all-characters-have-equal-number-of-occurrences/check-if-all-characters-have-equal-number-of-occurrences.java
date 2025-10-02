class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> ans=new HashMap<>();
        for(int i=0;i<s.length();i++){
            ans.put(s.charAt(i),ans.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Integer> a=new HashSet<>(ans.values());
        return a.size()==1;
    }
}