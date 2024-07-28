// Space Complexity: O(1) Solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // We shall do all the multiplication in result array
        
        int[] res = new int[nums.length];
        int prev = 1; // Will keep track of the previous sum
        for (int i = 0; i < nums.length; i++) {
            // Update current index to previous sum, 
            // then multiply previous sum with current to prepare for
            // next iteration.
            res[i] = prev;
            prev *= nums[i];
        }

        // Reset prev to 0 for getting right sum of each number
        prev = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // Multiply current index by the sum on the right of itself
            res[i] *= prev;

            // Update right sum by multiplying with current, 
            // for next iteration
            prev *= nums[i];
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}


// Space Complexity: O(n) Solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix array iterate through and multiply as we go along
        // postfix array iterate through backwards and multiply as we go 
        int length = nums.length;
        int[] prefix = new int[length];
        int[] postfix = new int[length];

        for(int i = 0; i < length; i++){
            if(i == 0){
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i - 1] * nums[i];
            }
        }

        // postfix reversed
        for(int i = length - 1; i >= 0; i--){
            if(i == length - 1) {
                postfix[i] = nums[i];
            } else {
                postfix[i] = postfix[i + 1] * nums[i];
            }
        }

        // fill up answer array by utilizing prefix and postfix arrays
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            if(i == 0){
                // base case, start element
                answer[i] = postfix[i + 1];
            } else if (i == length - 1){
                // base case, end element
                answer[i] = prefix[i - 1];
            } else {
                // else we just multiply not including current index
                answer[i] = prefix[i - 1] * postfix[i + 1];
            }
        }

        // Time Complexity: O(n + n + n) , we iterate over nums.length 3 times
        // Space Complexity: O(n + n) , we created two arrays based on nums.length
        return answer;
    }
}
