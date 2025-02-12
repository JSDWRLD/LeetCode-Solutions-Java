class Solution {
    public int maximumSum(int[] nums) {
        if (nums.length < 2) return -1;
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int n : nums) {
            int digitSum = digitSum(n);
            if (!map.containsKey(digitSum)) {
                map.put(digitSum, new PriorityQueue<Integer>((a,b) -> b-a));
            }

            map.get(digitSum).add(n);
        }

        int max = -1;
        for (PriorityQueue<Integer> pq : map.values()) {
            if (pq.size() > 1) {
                int temp = pq.poll();
                temp +=  + pq.poll();
                max = Math.max(max, temp);
            }
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return max;
    }
    
    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
