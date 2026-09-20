class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int end = heights.length - 1;
        int start = 0;
        while (start != end) {
            int startHeight = heights[start];
            int endHeight = heights[end];
            int minHeight = Math.min(startHeight, endHeight);
            int area = minHeight * (end - start);
            if (maxArea < area) maxArea = area;
            if (endHeight < startHeight) end--;
            else start++;
        }
        return maxArea;
    }
}
