class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // 2^n people so n = 3, 6 people
        // Positive and negative
        // cost[i][0] - cost[i][1]
        // negative then cheaper to goto A, right cost more
        // positive then cheaper to goto B
        
        // send first n people to a
        // send second n people to b

        Arrays.sort(costs, Comparator.comparingInt(a -> a[0] - a[1]));

        int n = costs.length/2; 
        int cost = 0;
        for (int i = 0; i < n; i++) cost += costs[i][0];
        for (int i = 0; i < n; i++) cost += costs[i+n][1];

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return cost;
    }
}

