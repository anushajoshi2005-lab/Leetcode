class Solution {
    public int maximumWealth(int[][] mat) {
       int n = mat.length;  //rows
       int m = mat[0].length;  //columns
       int max =0;
     
       for(int i =0;i<n;i++){
        int sum =0;   //at every incriment of i , sum will start from zero 
          for(int j =0;j<m;j++){
        sum = sum + mat[i][j] ;
          }
         max = Math.max(max,sum);
     }
      return max;
    }
}