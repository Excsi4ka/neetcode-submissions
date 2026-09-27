class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(var1, var2) -> {
            int diff = var2[0] - var2[0];
            if (diff != 0)
                return diff;
            return var1[1] - var2[1];
        });
        int prev = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] < prev) {
                prev = Math.min(interval[1], prev);
                ans++;
            } else {
                prev = interval[1];

            }
        }
        return ans;
    }
}
