class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (val1, val2) -> {
            return val1[0] - val2[0] != 0 ? val1[0] - val2[0] : val1[1] - val2[1];
        });
        List<int[]> answer = new ArrayList<>();
        int[] prev = intervals[0];
        answer.add(prev);
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], current[1]);
            } else {
                prev = current;
                answer.add(current);
            }
        }
        return answer.toArray(new int[0][0]);
    }
}
