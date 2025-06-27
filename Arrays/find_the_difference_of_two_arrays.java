class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(getElementDiff(nums1, nums2));
        result.add(getElementDiff(nums2, nums1));

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }

    private List<Integer> getElementDiff(int[] a, int[] b) {
        HashSet<Integer> onlyInA = new HashSet<>();
        HashSet<Integer> existInB = new HashSet<>();
        for (int n : b) existInB.add(n);

        for (int n : a) 
            if (!existInB.contains(n)) onlyInA.add(n);
        
        return new ArrayList<>(onlyInA);
    }
}
