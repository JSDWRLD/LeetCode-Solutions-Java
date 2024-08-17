class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        // Initialize variables, -1 cause we count the first subarray we find
        int lastPolled = -1, gap = - 1, res = 0;

        // Q for Sliding window
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            // Add to window if meets condition
            if (nums[i] % 2 != 0)
                q.add(i);
            // Remove from window if fails condition
            if (q.size() > k) 
                lastPolled = q.poll();
            
            // If our window is k size we add to result cause we found a
            // subarray that has k odds
            if (q.size() == k) {
                gap = q.peek() - lastPolled;
                res += gap;
            } 
        }

        // Time Complexity: O(n)
        // Space Complexiy: O(k)
        return res;
    }
}
