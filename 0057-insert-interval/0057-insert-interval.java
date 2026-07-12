class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> arr = new ArrayList<>();
        for(int i=0 ; i<intervals.length ; i++){
            arr.add(intervals[i]);
        }
        arr.add(newInterval);
        arr.sort((a,b)->Integer.compare(a[0],b[0]));
        int current[] = arr.get(0);
        List<int[]> ans = new ArrayList<>();
        for(int i=1 ; i<arr.size() ; i++){
            int next[] = arr.get(i);
            if(current[1]>=next[0]){
                current[1] = Math.max(current[1],next[1]);
            }
            else{
                ans.add(current);
                current = next;
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);
    }
}