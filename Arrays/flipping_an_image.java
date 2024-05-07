class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rowSize = image[0].length;
        int colSize = image.length;

        // Optimized Two Pointer Approach
        for(int col = 0; col < colSize; col++){
            int left = 0, right = rowSize - 1;

            while(left <= right){
                int leftNum = image[col][left];
                int rightNum = image[col][right];

                // Inverting
                if(leftNum == 0) leftNum = 1;
                else if(leftNum == 1) leftNum = 0;

                if(rightNum == 0) rightNum = 1;
                else if(rightNum == 1) rightNum = 0;

                // Swap
                image[col][left] = rightNum;
                image[col][right] = leftNum;

                // Move toward center
                left++;
                right--;
            }

        }

        // Time Complexity: O(n * m)
        // Space Complexity: O(1)
        return image;
    }
}

/* BRUTE FORCE
        // res reversed each row
        for(int col = 0; col < colSize; col++){
            int index = 0;
            for(int row = rowSize - 1; row >= 0; row--){
                int curr = image[col][row];
                if(curr == 0){
                    curr = 1;
                } else {
                    curr = 0;
                }
                res[col][index] = curr;
                index++;
            }
        }
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
*/
