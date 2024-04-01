class Solution {
    public int maxArea(int[] height) {

        // declaring our two pointers
        int start = 0;
        int end = height.length - 1;
        int max = 0;

        while(start < end) {
            // we use math.min in order to check for lowest height
            // this is because bucket of water
            int min = Math.min(height[start], height[end]);
            int area = min * (end - start);

            if(area >= max) max = area;

            // determine whether to shift left or right pointer
            if(height[start] < height[end]){
                start++;
            } else {
                end--;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
