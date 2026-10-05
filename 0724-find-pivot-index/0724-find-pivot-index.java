class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int[] parr = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++){
            sum =  sum+ arr[i];
            parr[i] = sum;
        } 
        int[] suff = new int[n];
        sum = 0;
        for(int i = n-1;i>=0;i--){
            sum = sum+ arr[i];
            suff[i] = sum ;
        }
        for(int i = 0 ;i<n;i++){
            if(suff[i]==parr[i]) return i;
        }
        return -1 ;
    }
}