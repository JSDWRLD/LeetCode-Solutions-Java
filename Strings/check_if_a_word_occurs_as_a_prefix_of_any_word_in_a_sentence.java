class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int searchWordLen = searchWord.length();
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            if (curr.length() >= searchWordLen) {
                String subOfWord = words[i].substring(0, searchWordLen);
                if (subOfWord.equals(searchWord)) return i+1;
            }
        }

        // N = amount of words in sentence
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return -1;
    }
}
