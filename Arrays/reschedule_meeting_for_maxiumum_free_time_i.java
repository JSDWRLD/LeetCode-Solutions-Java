class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] prefixDuration = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefixDuration[i+1] = prefixDuration[i] + endTime[i] - startTime[i];
        }

        int result = 0;
        for (int i = k-1; i < n; i++) {
            int left = i == k - 1 ? 0 : endTime[i - k];
            int right = i == n - 1 ? eventTime : startTime[i + 1];
            result = Math.max(result, right - left - (prefixDuration[i+1] - prefixDuration[i-k+1]));
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}

// shift the meetings to the max number, then find the largest gap?
// make all the meeting consecutive
// so start 3, end 3 
// do up to the max k reschedules
