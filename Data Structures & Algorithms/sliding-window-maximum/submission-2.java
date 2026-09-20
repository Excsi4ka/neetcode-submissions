class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((first, second) -> second[1] - first[1]);
        int[] ans = new int[nums.length + 1 - k];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(new int[]{i, nums[i]});
            if (i >= k - 1) {
                while (maxHeap.peek()[0] <= i - k) {
                    maxHeap.poll();
                }
                ans[index++] = maxHeap.peek()[1];
            }
        }
        return ans;       
    }
}
