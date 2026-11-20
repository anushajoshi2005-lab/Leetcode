class Solution {
    public int search(int[] nums, int target) {
        int min = findMin(nums);
        int idx1= bs(nums,0,min-1,target);
        int idx2 = bs(nums,min,nums.length -1 ,target);
        if(idx1 != -1) return idx1;
        else return idx2;
    }
    public int findMin(int[] nums){
        int h =nums.length -1 ;
        int l =0;
         while(l<h){      // 
            int mid = (l+h) /2;
            if(nums[mid]>nums[h]){
                l= mid+1;
            }
            else{
                h = mid;
            }
        }
       return l;
    }
    public int bs(int[] nums , int l , int h , int t){
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]== t) return mid;
            else if (nums[mid]>t) {
                   h = mid-1;
            }
            else {
               l = mid +1;
            }
        }
        return -1;
    }
}