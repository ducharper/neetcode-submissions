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
        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b) -> a.start - b.start);
        pq.addAll(intervals);

        while (pq.size() > 1) {
            Interval current = pq.poll();

            if (!(pq.peek().start >= current.end)) {
                return false;
            }
        }

        return true;
    }
}
