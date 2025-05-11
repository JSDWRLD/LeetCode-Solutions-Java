class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];

        // Iterate over all edges
        for (int[] edge : roads) {
            degree[edge[0]]++;
            degree[edge[1]]++;
        }

        // Sort from lowest neighbor count to highest
        Arrays.sort(degree);
        
        long numToAssign = 1;
        long totalImportance = 0;
        for (int neighCountOfVertex : degree) {
            totalImportance += numToAssign * neighCountOfVertex;
            numToAssign++; // increment to next
        }

        // Complete graph means there are V^2 edges
        // Time Complexity: O(v^2)
        // Space Complexity: O(n)
        return totalImportance;
    }
}

// get degree of each node
// sort array, assign lowest num to lowest degree node
// we can keep multiplying num * degree, because that is how many edges would 
// be connected to the node with that specific degree
// for example a node has 4 neighbors, the degree is 4
// we assigned the highest value n, this means our sum has 
// 4*n being added to it
