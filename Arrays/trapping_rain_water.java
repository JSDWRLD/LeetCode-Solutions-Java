class Solution {
    public int trap(int[] height) {
        int maxLeft = 0, maxRight = 0;
        int left = 0, right = height.length - 1;

        int sumWater = 0;
        while (left < right) {

            // We always calculate the current max depending on
            // left and right pointers
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);

            // move pointers based on the max height
            // while moving the minimum height we also calculate 
            // the water stored there, if it less than 0 we dont sum
            if (maxLeft > maxRight) {
                int water = maxRight - height[right];
                if (water > 0) sumWater += water;
                right--;
            } else {
                int water = maxLeft - height[left];
                if (water > 0) sumWater += water;
                left++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return sumWater;
    }
}
