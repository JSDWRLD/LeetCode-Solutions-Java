class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int n = fruits.length, result = 0;
        for (int i = 0; i < n; i++) {
            int fruit = fruits[i];
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (fruit <= baskets[j]) {
                    baskets[j] = 0;
                    found = true;
                    break;
                }
            }

            if (found == false) result++;
        }
        
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        return result;
    }
}
