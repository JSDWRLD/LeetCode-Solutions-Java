class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> diffCandy = new HashSet<>();
        int max = candyType.length/2;
        
        for (int c : candyType) 
            diffCandy.add(c);
        
        // We will always return the min of either n/2 
        // or the amount of different types of candy.
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return Math.min(diffCandy.size(), max);
    }
}
