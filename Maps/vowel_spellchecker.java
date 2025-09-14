class Solution {
    
    private HashSet<String> wordsReg;
    private HashMap<String, String> wordsLow;
    private HashMap<String, String> wordsNoVowel;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        wordsReg = new HashSet<>();
        wordsLow = new HashMap<>();
        wordsNoVowel = new HashMap<>();

        for (String s : wordlist) {
            wordsReg.add(s);
            String lower = s.toLowerCase(); 
            wordsLow.putIfAbsent(lower, s);
            wordsNoVowel.putIfAbsent(removeVowels(lower), s);
        }

        String[] res = new String[queries.length];
        int i = 0;
        for (String s : queries) {
            res[i] = solve(s);
            i++;
        }

        // C = Total of words from wordlist and queries
        // L is max length of a word, this instance 7
        // Time Complexity: O(C * L)
        // Space Complexity: O(C * L)
        return res;
    }

    private String solve(String s) {
        if (wordsReg.contains(s)) { return s; }

        String lower = s.toLowerCase();
        if (wordsLow.containsKey(lower))
        {
            return wordsLow.get(lower);
        }

        String noVowel = removeVowels(lower);
        if (wordsNoVowel.containsKey(noVowel)) 
        {
            return wordsNoVowel.get(noVowel);
        }

        return "";
    }

    private String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) sb.append("*");
            else sb.append(c);
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
