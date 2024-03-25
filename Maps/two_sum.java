class Solution {
    public int[] twoSum(int[] nums, int target) {
        // map a number and its index
        // search = target - current num of iteration
        // if map contains search return current iteration index and its index from map

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int search = target - nums[i];
            if(map.containsKey(search)){
                // returns index of search and current index
                return new int[] {map.get(search), i};
            } else {
                // puts the current number and it index
                map.put(nums[i], i);
            }
        }

        return new int[] {0,0};

        // Time Complexity: O(n) using one for loop
        // Space Complexity: O(n) using a hashmap which grows depending on array nums length
    }
}
