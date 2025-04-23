class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> sumFreq = new HashMap<>();
        int max = -1;
        // N
        for (int i = 1; i <= n; i++) {
            int ds = digitSum(i); // log x, x is the digits
            sumFreq.put(ds, sumFreq.getOrDefault(ds, 0) + 1);
            max = Math.max(sumFreq.get(ds), max); 
        }

        int groups = 0, largest = 0;
        for (int size : sumFreq.values()) {
            if (size == max) groups++;
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(log n) , we store the digit sum
        return groups;
    }

    // log x
    private int digitSum(int n) {
        int result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10; // log base 10
        }

        return result;
    }
}
