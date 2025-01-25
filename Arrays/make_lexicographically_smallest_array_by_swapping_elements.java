class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        
        // Create sorted array
        int[] numsSorted = new int[n];
        for (int i = 0; i < n; i++) numsSorted[i] = nums[i];
        Arrays.sort(numsSorted);

        // Initialize num to group map
        int currGroup = 0;
        HashMap<Integer, Integer> numToGroup = new HashMap<>();
        numToGroup.put(numsSorted[0], currGroup);
        
        // Initialize a group number to group list map
        HashMap<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
        groupToList.put(
            currGroup,
            new LinkedList<Integer>(Arrays.asList(numsSorted[0]))
        );

        for (int i = 1; i < n; i++) {
            int curr = numsSorted[i], prev = numsSorted[i-1];
            // If the sum > limit we are in next group
            if (Math.abs(curr - prev) > limit) currGroup += 1;
            numToGroup.put(curr, currGroup);

            if (!groupToList.containsKey(currGroup)) 
                groupToList.put(currGroup, new LinkedList<Integer>());

            // Continue adding numbers to the list of the curr group
            groupToList.get(currGroup).add(curr);
        }

        // Iterate over original list
        // add the smallest number from that group list
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            nums[i] = groupToList.get(group).remove();
        }

        // Because property is transitive, we can apply group sorting
        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return nums;
    }
}
