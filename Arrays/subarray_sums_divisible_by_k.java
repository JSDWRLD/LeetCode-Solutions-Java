class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // map each remainder
        HashMap<Integer, Integer> remMap = new HashMap<>();
        // intialize 0, edge case that 5/5 rem = 0
        remMap.put(0, 1);

        int sum = 0;
        int counter = 0;

        // iterate array
        for(int i = 0; i < nums.length; i++){
            // running prefix sum
            sum += nums[i];
            
            // get remainder
            int rem = (sum % k + k) % k;

            // if map doesnt contain remainder put inside
            if(!remMap.containsKey(rem)){
                remMap.put(rem, 1);
            } else {
                // if map does contain, then we found 1 subarray
                counter += remMap.get(rem);
                remMap.put(rem, remMap.get(rem) + 1);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return counter;
    }
}
