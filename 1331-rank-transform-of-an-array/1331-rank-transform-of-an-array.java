class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int nums[] = arr.clone();
        int rank = 1;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], rank);
                rank++;
            }
        }
        for (int i = 0; i <n; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}