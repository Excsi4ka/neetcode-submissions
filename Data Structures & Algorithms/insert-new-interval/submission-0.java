class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Comparator<int[]> comparator = (val1, val2) -> val1[0] - val2[0] != 0 ? val1[0] - val2[0] : val1[1] - val2[1];
        // Arrays.sort(intervals, comparator);
        // List<int[]> list = new ArrayList<>();
        // int[] prev = intervals[0];
        // for (int i = 1; i < intervals.length; i++) {
        //     int[] current = intervals[i];
        //     int[] small = current, big = newInterval;
        //     if (comprator.compare(newInterval, current) < 0) {
        //         small = newInterval;
        //         big = current;                
        //     } else {
        //         big = newInterval;
        //         small = current;
        //     }


        // }
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        Collections.sort(list, (val1, val2) -> {
            return val1[0] - val2[0] != 0 ? val1[0] - val2[0] : val1[1] - val2[1];
        });
        List<int[]> answer = new ArrayList<>();
        int[] prev = list.get(0);
        answer.add(prev);

        for (int i = 1; i < list.size(); i++) {
            int[] current = list.get(i);
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
