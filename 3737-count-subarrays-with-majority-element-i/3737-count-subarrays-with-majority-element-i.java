class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        int n =  nums.length;
        for (int left = 0; left < n; left++) {
            int freq = 0;
            for (int right = left; right < n; right++) {
                if(nums[right]==target){
                    freq++;
                }
                int length = right - left + 1;
                if (freq > length / 2) {
                    count++;
                }
            }
        }
        return count;
    }
}