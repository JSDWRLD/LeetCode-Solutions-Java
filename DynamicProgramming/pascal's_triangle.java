class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);

        for (int row = 1; row < numRows; row++) {
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(row-1);
            
            currRow.add(1);

            for (int i = 1; i < prevRow.size(); i++) {
                currRow.add(prevRow.get(i-1) + prevRow.get(i));
            }
            
            currRow.add(1);
            triangle.add(currRow);
        }

        // n= number of rows
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        return triangle;
    }
}
// 1
// 1, 1
// 1, 2, 1
// 1, 4, 6, 4, 1
// 1, 5, 10, 10, 5, 1
