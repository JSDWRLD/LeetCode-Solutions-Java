class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        int n = A.length;
        int[] prefixCommon = new int[n];
        for (int i = 0; i < n; i++) {
            int aCurr = A[i], bCurr = B[i];
            setA.add(aCurr);
            setB.add(bCurr);

            if (setB.contains(aCurr)) common.add(aCurr);
            if (setA.contains(bCurr)) common.add(bCurr);
            prefixCommon[i] = common.size();
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n + c)
        return prefixCommon;
    }
}
