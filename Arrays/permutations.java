class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> perms = new LinkedList<>();
        perms.offer(new ArrayList<>());

        for (int num : nums) {
            // Process each subset
            int permsSize = perms.size();

            // Process only up to permsSize
            for (int i = 0; i < permsSize; i++) {
                List<Integer> curr = perms.poll();

                for (int n = 0; n <= curr.size(); n++) {
                    // At each step add in num
                    List<Integer> temp = new ArrayList<>(curr);
                    temp.add(n, num);

                    // We only add all the subsets to result once it has same amount of elements
                    // as original input
                    if (temp.size() == nums.length) {
                        result.add(temp);
                    } else {
                        perms.offer(temp);
                    }
                }
            }
        }

        // P permutations and N elements
        // Time Complexity: O(n * p!)
        // Space Complexity: O(n * p!)
        return result;
    }
}
