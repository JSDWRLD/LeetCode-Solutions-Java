class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> partition = new ArrayList<>();
        // Add Empty set
        partition.add(new ArrayList<>());

        // Iterate list
        for (int num : nums) {
            int partitionSize = partition.size();
            
            // Iterate up to the amount of subsets
            for (int i = 0; i < partitionSize; i++) {
                // Copy each subset and add the current num
                List<Integer> temp = new ArrayList<>(partition.get(i));
                temp.add(num);
                partition.add(temp);
            }
        }

        // Time Complexity: O(2^n)
        // Space Complexity: O(2^n)
        return partition;
    }
}
