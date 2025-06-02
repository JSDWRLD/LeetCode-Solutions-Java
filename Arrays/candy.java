
// n children
// each must have 1
// higher rating = more candy than neighbors with lower ratings

// 1, 0, 2
// 2, 1, 2???
// greedy choice: min number
// if rating curr > rating next num + 1?
// all rating of 0 start at 1
// neighbors inc up if have higher rating

// if neighbors have same rating then just put 1
// 1, 2, 2
// 1 2 1

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Give each child 1 candy
        // if rating of curr child is greater than left neighbor inc
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1;
            }
        }

        int minNumOfCandies = candies[n-1];
        // check if curr rating > right neighbor, if so inc
        for (int i = n-2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                // Take the max so it satifies left and right neighbor
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
            // Add to our result
            minNumOfCandies += candies[i];
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return minNumOfCandies;
    }
}

