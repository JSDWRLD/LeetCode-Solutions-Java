class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) return new int[][] {};

        // We dont know how long result will be so making an arraylist is safer
        List<int[]> result = new ArrayList<>();
        int firstI = 0, secondI = 0;

        while (firstI < firstList.length && secondI < secondList.length) {
            // check if endpoint of A is in interval B
            int start = Math.max(firstList[firstI][0], secondList[secondI][0]);
            int end = Math.min(firstList[firstI][1], secondList[secondI][1]);
            if (start <= end) {
                result.add(new int[] {start, end});
            }

            // increment indexes, increment list w smallest end interval
            if (firstList[firstI][1] <= secondList[secondI][1]) {
                firstI++;
            } else {
                secondI++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result.toArray(new int[result.size()][]);
    }
}
