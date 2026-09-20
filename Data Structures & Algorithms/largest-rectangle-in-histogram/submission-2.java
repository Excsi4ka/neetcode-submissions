class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                stack.push(new int[]{i, heights[i]});
            } else {
                int[] prev = stack.peek();
                int leftmost = i;
                while (prev != null && prev[1] > heights[i]) {
                    int area = prev[1] * (i - prev[0]);
                    if (area > ans)
                        ans = area;
                    leftmost = prev[0];
                    stack.pop();
                    prev = stack.peek();   
                }
                stack.push(new int[]{leftmost, heights[i]});
            }
        }
        while (!stack.isEmpty()) {
            int[] entry = stack.pop();
            int area = entry[1] * (heights.length - entry[0]);
            if (area > ans)
                ans = area;
        }

        return ans;
    }
}
