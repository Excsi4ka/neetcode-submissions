class Solution {
    public int largestRectangleArea(int[] heights) {
        //ArrayDeque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            for (int j = left; j >= 0; j--) {
                if (heights[j] >= heights[i]) 
                    left = j;
                else
                    break;
            }
            int right = i;
            for (int k = right; k < heights.length; k++) {
                if (heights[k] >= heights[i]) 
                    right = k;
                else
                    break;
            }
            int area = heights[i] * (right - left + 1);
            if (area > ans)
                ans = area;
        }
        return ans;
    }
}
