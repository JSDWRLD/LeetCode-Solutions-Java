class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        
        // dp? states?
        // longest subsequence that matches
        // i = length of longest that satisfies
        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // if they are in the same group or do not have a dist = 1 skip
                if (groups[i] == groups[j] || !diffCheck(words[i], words[j])) 
                    continue;

                if (dp[i] < dp[j]+1) {
                    dp[i] = dp[j]+1; 
                    parent[i] = j;
                }
            }
            
            if (dp[i] > maxIndex) maxIndex = dp[i];
        }
        
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxIndex) {
                while (i != -1) {
                    res.add(words[i]);
                    i = parent[i];
                }
                break;
            }
        }

        Collections.reverse(res);

        // L = length of largest string
        // Time Complexity: O(n^2 * L)
        // Space Complexity: O(n)
        return res;
    }

    private boolean diffCheck(String prev, String curr) {
        if (prev.length() != curr.length()) return false;

        int diff = 0;
        for (int i = 0; i < prev.length(); i++) {
            if (prev.charAt(i) != curr.charAt(i)) diff++;
            if (diff > 1) break;
        }

        return diff == 1;
    }
}



// not in same group
// number of diff chars is 1
// greedy?
// take first word in the first group
// find a diff, if diff one then return true add to res?
