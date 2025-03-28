class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> intervals = new ArrayList<>();

        int prevStart = meetings[0][0];
        int prevEnd = meetings[0][1];
        for (int i = 1; i < meetings.length; i++) {
            int currStart = meetings[i][0], currEnd = meetings[i][1];

            if (prevEnd >= currStart) {
                // merge
                prevStart = Math.min(prevStart, currStart);
                prevEnd = Math.max(prevEnd, currEnd);
            } else {
                intervals.add(new int[] {prevStart, prevEnd});
                prevStart = currStart;
                prevEnd = currEnd;
            }
        }
        intervals.add(new int[] {prevStart, prevEnd});
        
        
        // If there are free days before the first meeting add difference
        int freeDays = 0;
        if(intervals.get(0)[0] > 1){
            freeDays += intervals.get(0)[0] - 1;
        }

        // iterate through the list and sum diff of start next - end prev -1
        for (int i = 1; i < intervals.size(); i++) {
            freeDays += intervals.get(i)[0] - intervals.get(i - 1)[1] - 1;
        }

        // If the last intervals end time is less than days add the difference
        if(intervals.get(intervals.size() - 1)[1] < days){
            freeDays += days - intervals.get(intervals.size() - 1)[1];
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return freeDays;
    }
}
