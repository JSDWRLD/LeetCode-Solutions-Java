class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);

        Long curr = 1L;
        for (int i = 1; i <= n; i++) {
            curr = set.pollFirst();

            set.add(curr*2);
            set.add(curr*3);
            set.add(curr*5);
        }

        // m = size of set
        // Time Complexity: O(n * m)
        // Space Complexity: O(m)
        return curr.intValue();
    }
}

// 1 has no prime so all count
// divided by 2, 3, 5 without remainder
