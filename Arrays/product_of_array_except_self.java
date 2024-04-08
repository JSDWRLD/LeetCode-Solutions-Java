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
