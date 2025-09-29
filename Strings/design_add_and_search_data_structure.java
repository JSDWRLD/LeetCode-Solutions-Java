class WordDictionary {
    private TrieNode root; 

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        // make a copy of root
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            // if the current char doesnt exist make a 
            // new trie node and add to child hashmap of curr
            if (!curr.children.containsKey(c)) {
                curr.children.put(c, new TrieNode());
            }

            // move to the next child
            curr = curr.children.get(c);
        }

        // once at end we set to complete
        curr.isComplete = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        return nodeSearch(word, curr);
    }

    private boolean nodeSearch(String word, TrieNode curr) {
        
        for (int i = 0; i < word.length(); i++) 
        {
            char currChar = word.charAt(i);
            if (currChar != '.') 
            {
                // if it is not a '.' and doesnt exist in children
                if (!curr.children.containsKey(currChar)) return false;

                // next it exists so get the next node
                curr = curr.children.get(currChar);
            }
            else // dot node
            {
                // iterate over all the children of the curr trienode
                for (Character key : curr.children.keySet()) {
                    TrieNode child = curr.children.get(key);
                    // we find a valid path
                    if (nodeSearch(word.substring(i+1, word.length()), child)) {
                        return true;
                    }
                }

                // if we iterate over all children and dont find a path
                return false;
            }
        } 

        return curr.isComplete;
    }
}

class TrieNode {
    // Easy Look up
    HashMap<Character, TrieNode> children;
    boolean isComplete; 

    public TrieNode() {
        children = new HashMap<>();
        isComplete = false;
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
