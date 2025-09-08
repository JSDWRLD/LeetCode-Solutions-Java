class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int diff = Math.abs(arr[i] - arr[i+1]);
            if (diff > minDiff) continue;

            if (diff < minDiff) {
                minDiff = diff;
                res.clear();
            }

            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[i+1]);
            res.add(temp);
        } 

        // sorting
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return res;
    }
}
