class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int index = k+1;
        for(int i = 0; i < nums.length; i++){
            if(nums[k] != nums[i]){
                nums[index] = nums[i];
                index++;
                k++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return index;
    }
}
