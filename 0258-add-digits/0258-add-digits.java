class Solution {
    public int addDigits(int n) {
      if(n<=9) return n;
      else{
       int sum = 0;
        while(n!=0){
          //  n=n%10;
            sum=sum+n%10;
            n=n/10;
        }
        return addDigits(sum);
      }
    }
}