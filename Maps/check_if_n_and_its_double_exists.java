class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            if (set.contains(n*2) || (n % 2 == 0 && set.contains(n/2))) return true;
            set.add(n);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return false;
    }
}
