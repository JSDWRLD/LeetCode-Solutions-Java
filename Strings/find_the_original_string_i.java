class Solution {
    public int possibleStringCount(String word) {
        int answer = 1; // Complete string

        // find possible strings
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i-1)) answer++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return answer;
    }
}

// did it at most once
// so 

// abbcccc
// only count?
// a: 1 
// b: 2 1
// c: 4 3 
