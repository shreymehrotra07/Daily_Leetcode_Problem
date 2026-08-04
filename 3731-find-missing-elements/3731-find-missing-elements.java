class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(min>nums[i]) min = nums[i];
            if(max<nums[i]) max = nums[i];
            set.add(nums[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=min ; i<=max ; i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}