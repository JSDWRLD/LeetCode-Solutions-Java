class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int[] maxLeft = new int[n];
        maxLeft[0] = values[0];

        int res = -1;
        for (int i = 1; i < n; i++) {
            res = Math.max(maxLeft[i-1] + values[i] - i, res);
            maxLeft[i] = Math.max(values[i]+i, maxLeft[i-1]);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}

// value of sightseeing spot is ith
// spots i and j, j - i dist cause j larger
// i < j, score: values[i] + values[j] - (dist)
// find max score

// max var
// brute force o(n^2)
// 8, 1, 5, 2, 6
// dp, max left as we go
// max right is curr
// left adds values[i] + i, 
// curr will add values[j] - j
