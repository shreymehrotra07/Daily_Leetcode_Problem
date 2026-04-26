class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int result = Integer.MIN_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[1] - b[0] - (a[1] - a[0])));
        for (int[] point : points) {
            while (!pq.isEmpty() && point[0] - pq.peek()[0] > k) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                int[] head = pq.peek();
                result = Math.max(result, point[1] + head[1] + point[0] - head[0]);
            }
            pq.offer(point);
        }
        
        return result;
    }
}