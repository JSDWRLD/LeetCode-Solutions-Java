class Solution {

    private int possibilities;
    private HashMap<Character, Integer> charFreq;

    public int numTilePossibilities(String tiles) {
        possibilities = 0;
        charFreq = new HashMap<>();

        for (char c : tiles.toCharArray()) 
            charFreq.put(c, charFreq.getOrDefault(c, 0)+1);
        
        // We would do our recursive calls
        backtrackAndCount(tiles.length(), 0);

        // Time Complexity: O(n!)
        // Space Complexity: O(n)
        return possibilities;
    }

    private void backtrackAndCount(int tilesLen, int pathLen) {
        if (pathLen == tilesLen) return;

        for (char key : charFreq.keySet()) {
            int freq = charFreq.get(key);
            if (freq > 0) {
                charFreq.put(key, freq-1);

                possibilities += 1;
                backtrackAndCount(tilesLen, pathLen++);

                pathLen -= 1;
                charFreq.put(key, charFreq.get(key)+1);
            }
        }
    }
}
