class Solution {
    public int longestConsecutive(int[] nums) {

        // Fill set with all elements of Array
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        // max keeps track of biggest sequence
        int maxSeq = 0;
        int currSeq = 0;

        // We now traverse the array
        for(int i = 0; i < nums.length; i++){
            // We check the set to see if the current element "i"
            // has a value to the left, if it doesn't that signals its
            // the start of a sequence
            if(!set.contains(nums[i] - 1)){
                // reset currSeq if we found a start seq value
                currSeq = 0;
                // while the start still has a number in front of it
                // chaining
                while(set.contains(nums[i] + currSeq)){

                    // incrementing by 1
                    currSeq++;
                }

                // grabs the max seq
                maxSeq = Math.max(maxSeq, currSeq);
            }
        }

        // Time Complexity: O(n)      traversing array
        // Space Complexity: O(n)     creating a set
        return maxSeq;
    }
}
