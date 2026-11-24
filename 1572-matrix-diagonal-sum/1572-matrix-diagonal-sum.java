class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int i =0;i<n;i++){
            sum = sum + mat[i][i];   //for primary diagonal
            sum = sum+ mat[i][n-i-1];  //for secondary diagonal
        }
        if(n%2 !=0) return sum - mat[n/2][n/2];  // if n is odd , middle element is added twice .
        else return sum;

    }
}