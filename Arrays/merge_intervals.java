class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort based on interval start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> temp = new ArrayList<>();

        // Define our intial start and end time intervals
        int start = intervals[0][0], end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            // compare pair A end to pair B start time
            if (end >= intervals[i][0]) {
                if (end < intervals[i][1]) {
                    // if pair A end is less than pair B end time update end
                    end = intervals[i][1];
                }

                // this will move to the next iteration and check if our merged interval
                // could be bigger
                continue;
            }

            temp.add(new int[] {start, end});
            start = intervals[i][0];
            end = intervals[i][1];
        }

        // Add the last interval
        temp.add(new int[] {start,end});



        // After our temp is filled we want to add to our result
        int[][] result = new int[temp.size()][2];

        int i = 0;
        for (int[] interval : temp) {
            result[i][0] = interval[0];
            result[i][1] = interval[1];
            i++;
        }


        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return result;
    }

    // Notes: Time complexity is O(n log n) in Java because of the Arrays.sort method
    //        Arrays.sort also sorts using either merge sort or tim sort and that also
    //        uses O(N) space.
}
