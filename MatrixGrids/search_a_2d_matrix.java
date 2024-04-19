class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rowLeft = 0;
        int rowRight = matrix.length - 1;
        int lastI = matrix[0].length - 1;
        
        while(rowLeft <= rowRight){
            int rowMid = (rowLeft + rowRight) / 2;
            if(matrix[rowMid][0] <= target && matrix[rowMid][lastI] >= target) {
                // search columns cause we found right row
                int colLeft = 0;
                int colRight = lastI;
                while(colLeft <= colRight){
                    int colMid = (colLeft + colRight) /2;

                    if(matrix[rowMid][colMid] == target){
                        return true;
                    }

                    if(matrix[rowMid][colMid] < target) {
                        colLeft = colMid + 1;
                    } else {
                        colRight = colMid - 1;
                    }
                }

                return false;
            } 

            if(matrix[rowMid][lastI] > target) {
                // shift up a row
                rowRight = rowMid - 1;
            } else {
                // shift down
                rowLeft = rowMid + 1;
            }
        }


        // Time Complexity: O(log m + n)
        // Space Complexity: O(1)
        return false;
    }
}
