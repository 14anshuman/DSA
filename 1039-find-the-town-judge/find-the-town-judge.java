class Solution {
    public int findJudge(int n, int[][] trust) {
        int inDegree[] = new int[n + 1];   
        

        for (int[] r : trust) {
            int person1 = r[0];  
            int person2 = r[1];  
            inDegree[person1]--;
            inDegree[person2]++;  
        }

       
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1) {
                return i; 
            }
        }

        return -1; 
    }
}