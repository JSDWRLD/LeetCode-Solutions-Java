class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];

        while(numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] < target) {
                // if greater total greater than target move start pointer
                start++;
            } else {
                // its smaller than we move end pointer
                end--;
            }
        }
    
        result[0] = start + 1;
        result[1] = end + 1;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
