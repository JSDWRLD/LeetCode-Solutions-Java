class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int res = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key+1)) 
                res = Math.max(res, map.get(key) + map.get(key+1));
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}

// [1,3,2,2,5,2,3,7]
// 1: 1
// 2: 3
// 3: 2
// 5: 1
// 7: 1
