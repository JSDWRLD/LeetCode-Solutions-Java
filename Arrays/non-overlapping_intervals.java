class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort by start time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int end = intervals[0][1];
        int result = 0;

        for (int i = 1; i < intervals.length; i++) {
            // This is if the intervals dont overlap
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
            } else {
                // intervals overlap so we remove one and keep the end time that is the smallest
                // this reduces the chance of overlap further
                result++;
                end = Math.min(end, intervals[i][1]);
            }
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return result;
    }
}
