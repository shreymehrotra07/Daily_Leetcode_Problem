class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int currEnd = intervals[0][1];
        int removeCount = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (currEnd > intervals[i][0]) {
                removeCount++;
            } else {
                currEnd = intervals[i][1];
            }
        }
        return removeCount;
    }
}