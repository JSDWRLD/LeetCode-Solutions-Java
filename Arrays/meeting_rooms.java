class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) return true;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
        int lastFinish = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (lastFinish > intervals[i][0]) return false;
            lastFinish = intervals[i][1];
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return true;
    }
}
