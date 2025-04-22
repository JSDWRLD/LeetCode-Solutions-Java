class Solution {
    public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
        
        List<List<Integer>> result = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < encoded1.length) { // Up to N length
            int[] firstPair = encoded1[p1];
            int[] secondPair = encoded2[p2];

            // Get the most common frequency, then the multiple to be added
            // if there is excess frequency we add to the next pair
            int commonFreq = Math.min(firstPair[1], secondPair[1]);
            int multiple = firstPair[0] * secondPair[0];

            // To store next pair 
            List<Integer> nextPair = new ArrayList<>();

            // Check prev pair in result if it has the same multiple
            if (result.size() != 0 && result.get(result.size()-1).get(0) == multiple) {
                nextPair.add(multiple);
                nextPair.add(result.get(result.size()-1).get(1) + commonFreq);
                result.remove(result.size()-1); // remove the previous one
            }
            // Else the previous pair has a different number, dont need to combine 
            else {
                nextPair.add(multiple);
                nextPair.add(commonFreq);
            }

            // Add the next pair to the result
            result.add(nextPair);

            // Decrement the commonFreq
            firstPair[1] -= commonFreq;
            secondPair[1] -= commonFreq;

            // Increment the pointer
            if (firstPair[1] == 0) p1++;
            if (secondPair[1] == 0) p2++;
        }

        // N is the length of the expanded RLE encoding
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
