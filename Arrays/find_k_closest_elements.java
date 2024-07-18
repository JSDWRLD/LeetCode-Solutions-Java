class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int z) {
        int index = binarySearch(arr, z);
        int left = index;
        int right = index + 1;

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (left >= 0 && right < arr.length) {
                int diff1 = Math.abs(arr[left] - z);
                int diff2 = Math.abs(arr[right] - z);

                if (diff1 <= diff2) {
                    result.add(0, arr[left--]);
                } else {
                    result.add(arr[right++]);
                }
            } else if (left >= 0) {
                result.add(0, arr[left--]);
            } else if (right < arr.length) {
                result.add(arr[right++]);
            }
        }
        
        // Log n for binary search and k for k numbers
        // Time Complexity: O(log n + k)
        // Space Complexity: O(1)
        return result;
    }

    private int binarySearch(int[] arr, int z) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (end - start) + start/2;
            if (arr[mid] == z) {
                return mid;
            } else if (arr[mid] > z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start > 0) {
            return start - 1;
        }

        return start;
    }
}
