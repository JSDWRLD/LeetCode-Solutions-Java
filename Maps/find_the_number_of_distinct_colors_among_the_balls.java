class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        // Ball, Color Map
        HashMap<Integer, Integer> ballMap = new HashMap<>();
        HashMap<Integer, Integer> colorFreq = new HashMap<>();

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            
            if (ballMap.containsKey(ball)) {
                int prevColor = ballMap.get(ball);
                colorFreq.put(prevColor, colorFreq.get(prevColor)-1);

                if (colorFreq.get(prevColor) == 0) 
                    colorFreq.remove(prevColor);
            }

            ballMap.put(ball, color);
            colorFreq.put(color, colorFreq.getOrDefault(color, 0) + 1);
            result[i] = colorFreq.size();
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
