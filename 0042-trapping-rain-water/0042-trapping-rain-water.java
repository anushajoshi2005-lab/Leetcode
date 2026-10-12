class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int[] parr = new int[n];
        int[] sarr = new int[n];
        parr[0] = nums[0];
        sarr[n-1] = nums[n-1];
        for(int i = 1;i<n;i++){
            parr[i] = Math.max(nums[i],parr[i-1]);
        }
        for(int i =n-2;i>=0;i--){
            sarr[i] = Math.max(nums[i],sarr[i+1]);
        }
        int sum =0;
        for(int i =0;i<n;i++){
        sum = sum+Math.min(parr[i],sarr[i]) - nums[i];
        }
        return sum;
    }
}