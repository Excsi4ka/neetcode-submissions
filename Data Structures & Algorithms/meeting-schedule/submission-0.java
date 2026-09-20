/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);
        int start = 0;
        for (int i = 1; i < intervals.size(); i++) {
            Interval prev = intervals.get(start);
            Interval curr = intervals.get(i);
            if(prev.end > curr.start)
                return false;
            else
                start++;
        }
        return true;
    }
}
