class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        toreverse(nums,0,n-1);
        toreverse(nums,0,k-1);
        toreverse(nums,k,n-1);
    }
    public void toreverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}