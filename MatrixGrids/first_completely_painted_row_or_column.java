class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rowLen = mat.length, colLen = mat[0].length;
        int[] rowCount = new int[rowLen], colCount = new int[colLen];
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                map.put(mat[r][c], new int[] {r, c});
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int[] pos = map.get(curr);
            rowCount[pos[0]] += 1;
            colCount[pos[1]] += 1;
            if (rowCount[pos[0]] == colLen || colCount[pos[1]] == rowLen) return i;
        }


        // Space for map is r*c, count arrays are r and c respectively.
        // Time Complexity: O(r *c)
        // Space Complexity: O(r * c)
        return -1;
    }
}


// Brute Force
// O (n * m) Time and Space
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rowLen = mat.length, colLen = mat[0].length;

        HashMap<Integer, int[]> map = new HashMap<>();
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                map.put(mat[r][c], new int[] {r, c});
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int[] pos = map.get(curr);
            int posRow = pos[0], posCol = pos[1];
            mat[posRow][posCol] = -1;

            boolean isValidRow = true;
            boolean isValidCol = true;
            // Check Row
            for (int c = posCol-1; c >= 0; c--) {
                if (mat[posRow][c] != -1) {
                    isValidRow = false;
                    break;
                }
            }
            for (int c = posCol+1; c < colLen; c++) {
                if (mat[posRow][c] != -1) {
                    isValidRow = false;
                    break;
                }
            }
            // Check Col
            for (int r = posRow-1; r >= 0; r--) {
                if (mat[r][posCol] != -1) {
                    isValidCol = false;
                    break;
                }
            }

            for (int r = posRow+1; r < rowLen; r++) {
                if (mat[r][posCol] != -1) {
                    isValidCol = false;
                    break;
                }
            }

            if (isValidRow || isValidCol) return i;
        }

        return -1;
    }
}
