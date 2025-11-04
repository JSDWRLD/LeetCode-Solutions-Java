import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) 
        {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++)
            {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // sort by (freq desc, value desc)
            List<int[]> pairs = new ArrayList<>();
            for (var e : freq.entrySet()) // o (k)
            {
                pairs.add(new int[]{e.getKey(), e.getValue()});
            }

            // k log k
            pairs.sort((a, b) -> {
                // sort by freq
                if (a[1] != b[1]) return b[1] - a[1];
                // else same freq sort by bigger val
                return b[0] - a[0]; 
            });

            int sum = 0, used = 0;
            // keep only top x most freq nums, we sorted previously
            for (int[] p : pairs) {
                if (used == x) break;

                // multiply by the freq, we only counting pairs
                sum += p[0] * p[1];
                used++;
            }

            res[i] = sum;
        }

        // n nums
        // k numbers in subarray
        // Time: O(n * k log k)
        // Space: O(k)
        return res;
    }
}
