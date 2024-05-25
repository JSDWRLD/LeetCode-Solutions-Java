class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> temp = new ArrayList<>();
        int start = newInterval[0], end = newInterval[1];

        // add all the intervals that come before where the new interval should be placed
        int j = 0;
        while (j < intervals.length && start > intervals[j][1]) {
            temp.add(new int[] {intervals[j][0], intervals[j][1]});
            j++;
        }
        
        // continue off where we left off in array and merge
        // the new interval to be inserted
        while (j < intervals.length && intervals[j][0] <= end) {
            start = Math.min(intervals[j][0], start);
            end = Math.max(intervals[j][1], end);
            j++;
        }

        // add our new interval in
        temp.add(new int[] {start, end});

        // add the rest of the intervals, where we left off
        while (j < intervals.length) {
            temp.add(new int[] {intervals[j][0], intervals[j][1]});
            j++;
        }

        // convert to a 2d array, from our temp arraylist
        int[][] result = new int[temp.size()][2];
        int index = 0;
        for (int[] interval : temp) {
            result[index][0] = interval[0];
            result[index][1] = interval[1];
            index++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
