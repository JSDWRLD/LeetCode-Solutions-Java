class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int currTank = 0, totalTank = 0, startAns = 0;
        for (int i = 0; i < gas.length; i++) {
            // Add to our summative tank
            totalTank += gas[i] - cost[i];
            // Our running tank to keep track possible start
            currTank += gas[i] - cost[i];

            if (currTank < 0) {
                startAns = i + 1; // Increment to next possible index
                currTank = 0;
            }
        }

        // If our total tank is >= 0 it means we have enough
        // to get past all the stations with their costs
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return totalTank >= 0 ? startAns : -1;
    }
}
