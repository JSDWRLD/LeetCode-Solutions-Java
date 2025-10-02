class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int answer = numBottles;

        for (int empty = numBottles; empty >= numExchange; numExchange++) {
            empty -= numExchange-1; // minus by 1 since 1 ful bottle is added back
            answer++;
        }

        // Time Complexity: O(sqrt(n))
        // Space Complexity: O(1)
        return answer;
    }
}
