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
            if(intervals.get(start++).end > intervals.get(i).start)
                return false;
        }
        return true;
    }
}
