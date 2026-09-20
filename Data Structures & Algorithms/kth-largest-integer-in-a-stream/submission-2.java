class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int kth;
    public KthLargest(int k, int[] nums) {
        kth = k;
        for(int i : nums){
            minHeap.add(i);
        }
        while(minHeap.size() > k)
        minHeap.poll();
    }
    
    public int add(int val) {
        minHeap.add(val);
       if(minHeap.size() > kth) 
       minHeap.poll();
       return minHeap.peek();
    }
}
