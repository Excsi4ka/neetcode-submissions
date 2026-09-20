class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(  (arr1, arr2) -> {
            double dist1 = Math.sqrt(Math.pow(arr1[0] - 0,2) + Math.pow(arr1[1] - 0,2));
            double dist2 = Math.sqrt(Math.pow(arr2[0] - 0,2) + Math.pow(arr2[1] - 0,2)) ;
            double diff = dist1 - dist2;
            if(diff < 0)
                return (int) Math.floor(diff);
            else 
                return (int) Math.ceil(diff);

        });
        for(int[] arr : points) 
            minHeap.add(arr);
        for(int i = 0; i < k; i++)
            ans[i] = minHeap.poll();
        return ans;
    }
}
