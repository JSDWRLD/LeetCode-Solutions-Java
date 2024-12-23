public class Solution {
    
    public String triangleType(int[] nums) {
        // Step 1: Check the triangle inequality condition
        if (!(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[2] + nums[1] > nums[0]))
            return "none";  // If the sides do not satisfy the triangle inequality, return "none"

        
        if (nums[0] == nums[1] && nums[1] == nums[2])
            return "equilateral";  // If all sides are equal, return "equilateral"
        else if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2])
            return "scalene";  // If no two sides are equal, return "scalene"
        
        // Default to isosceles
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return "isosceles";  
    }
} 
