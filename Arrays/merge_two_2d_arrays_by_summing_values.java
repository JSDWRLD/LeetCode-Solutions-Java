class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> temp = new ArrayList<>();
        int oneP = 0, twoP = 0;
        int lenOne = nums1.length, lenTwo = nums2.length;
        while (oneP < lenOne || twoP < lenTwo) {
            if (oneP < lenOne && twoP < lenTwo) {
                int oneId = nums1[oneP][0], twoId = nums2[twoP][0];
                if (oneId == twoId) {
                    temp.add(new int[] {oneId , (nums1[oneP][1] + nums2[twoP][1])});
                    oneP++;
                    twoP++;
                } else if (oneId < twoId) {
                    temp.add(new int[] {oneId, nums1[oneP][1]});
                    oneP++;
                } else {
                    temp.add(new int[] {twoId, nums2[twoP][1]});
                    twoP++;
                }
            } else if (oneP < lenOne) {
                temp.add(new int[] {nums1[oneP][0], nums1[oneP][1]});
                oneP++;
            } else {
                    temp.add(new int[] {nums2[twoP][0], nums2[twoP][1]});
                    twoP++;
            }
        }

        int[][] result = new int[temp.size()][2];
        int i = 0;
        for (int[] pair : temp) {
            result[i][0] = pair[0];
            result[i][1] = pair[1];
            i++;
        }

        // Time Complexity: O(n + m)
        // Space Complexity: O(n + m)
        return result;
    }
}
