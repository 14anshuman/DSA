class Solution {
    private void sortOf(int row,int col,int [][]mat){
        ArrayList<Integer> al=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int i=row,j=col;
        while(i<n&&j<m){
            al.add(mat[i++][j++]);
        }
        Collections.sort(al);
        int idx=0;
        i=row;
        j=col;
        while(i<n&&j<m){
            mat[i++][j++]=al.get(idx++);
        }
    }
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<m;i++){
            sortOf(0,i,mat);
        }
        for(int i=1;i<n;i++){
            sortOf(i,0,mat);
        }
        return mat;
    }
}