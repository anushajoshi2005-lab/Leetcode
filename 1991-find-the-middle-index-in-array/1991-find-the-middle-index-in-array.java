class Solution {
    public int findMiddleIndex(int[] arr) {
       int n = arr.length;
        int[] parr = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+ arr[i];
            parr[i] = sum;
        }
        int[] suff = new int[n];
        int sum1 =0;
        for(int i = n-1;i>=0;i--){
            sum1 = sum1+ arr[i];
            suff[i] = sum1; 
        }
        for(int i =0;i<n;i++){
        if(parr[i]==suff[i]) return i ;
        }
        return -1 ;
    }
}
