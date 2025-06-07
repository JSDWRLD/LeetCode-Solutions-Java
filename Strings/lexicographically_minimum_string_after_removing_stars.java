class Solution {
    public String clearStars(String s) {
        // char stack to maintain rightmost index of the char near *
        
        // if we encounter a star in traversal, then 
        // search for smallest char that doesnt have empty stack
        // pop it and set it as '*'
        // else add to its corresponsding stack
        Stack<Integer>[] charStacks = new Stack[26];
        for (int i = 0; i < 26; i++) charStacks[i] = new Stack<>();

        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            char curr = sArr[i];
            if (curr != '*') {
                charStacks[curr-'a'].push(i);
            } else {
                // Find smallest char at the closest index to the star
                for (int j = 0; j < 26; j++) {
                    if (!charStacks[j].isEmpty()) {
                        int closestIndex = charStacks[j].pop();
                        sArr[closestIndex] = '*';
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : sArr) {
            if (c != '*') sb.append(c);
        }

        // Limited by 26 chars in alpha, and n chars in string
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
