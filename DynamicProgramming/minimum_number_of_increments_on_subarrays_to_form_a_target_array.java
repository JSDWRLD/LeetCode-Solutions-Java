class Solution {
    public int minNumberOperations(int[] target) {
        // if the previous is smaller than the current
        // we must increment +diff ops
        // intially prev is 0, cause nothing on left of idx 0
        int prev = 0, result = 0;
        for (int i = 0; i < target.length; i++) {
            int curr = target[i];
            if (curr > prev) {
                result += curr - prev;
            }
            prev = curr;
        }

        // Time: O(n)
        // Space: O(1)
        return result;
    }
}

// 3,1,1,2
// 3,

// max = 1
// ops = 4
