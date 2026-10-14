class Solution {
    public boolean threeFibonacciSum(int n) {
      if(n%2 !=0) return false;
      return checkFiboo(n/2);
    }
    public boolean checkFiboo(int n){
        int a = 0;
        int b = 1;
        int sum= 0;
        while(sum<n){
            sum = a+b;
            a=b;
            b=sum;
        } 
        if(sum==n) return true;
        else return false;
    } 
}