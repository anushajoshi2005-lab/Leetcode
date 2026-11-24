class Solution {
    public int countNegatives(int[][] mat) {
      int n = mat.length;  // rows
      int m = mat[0].length; // columns
      int count =0;
      for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
            if(mat[i][j]<0){        //for negative integers
                count++ ;
            }
        }
      }
      return count;
    }
}