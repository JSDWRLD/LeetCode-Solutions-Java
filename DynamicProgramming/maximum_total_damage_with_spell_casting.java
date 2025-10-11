class Solution {
    public long maximumTotalDamage(int[] power) {
        int n = power.length;

        // Count frequencies, treemap keys sorted
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : power) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        // Whatever num we tak we can take numbers of similar dmg
        long[] nums = new long[n];
        long[] dmgGain = new long[n];

        int idx = 0;
        for (int dmg : freq.keySet()) {
            nums[idx] = dmg;
            dmgGain[idx] = dmg * (long)freq.get(dmg);
            idx++;
        }

        // Now iterate over all the possible starting dmg values we can have
        // dp[i] = best dmg total if we must take num[i]
        long[] dp = new long[n];
        int left = 0;
        long bestSoFar = 0, maxDmg = 0;
        for (int i = 0; i < n; i++) { 
            long currNum = nums[i];
            // now move left until our condition is no longer valid
            // cond: left < i && values[left] < currNum - 2
            while (left < i && nums[left] < currNum - 2) {
                bestSoFar = Math.max(bestSoFar, dp[left]); // Check for best
                left++;
            }

            // if we take the current value we get curr*freq of it
            // and any valid numbers that fit the above constraints
            // aka, bestSoFar will only be updated if we enter
            // the while loop and start moving left pointer
            dp[i] = dmgGain[i] + bestSoFar; 
            maxDmg = Math.max(maxDmg, dp[i]);
        }

        // Time: O(n log n)
        // Space: O(n)
        return maxDmg;
    }
}
// power[i] casted, cannot cast any -2, -1, 1, 2 than curr
// can only cast once'
// find max dmg

// 1,1,3,4
// 1+1+4 = 6
// because 1==1, and 4 > 3, out of range
// sort? get from end
// 1, 6, 6, 7
// 1, 6, 6 = 13
// 1,

// just always chose earliest?
