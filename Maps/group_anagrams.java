class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map for mapping out anagrams 
        HashMap<String, List<String>> map = new HashMap<>();

        // iterate through array parameter
        for(int i = 0; i < strs.length; i++){
            // split characters to sort for anagram check
            char[] split = strs[i].toCharArray();
            Arrays.sort(split);

            // convert sorted word to string
            String sortedWord = new String(split);

            // check our map to see if the word exists
            // example sortedWord = aet, strs[i] could be eat, ate, or tea
            // they will always be the same in the map cause we use sortedWord as key
            if(!map.containsKey(sortedWord)){
                // if map does not contain that key, we create it and make an arrayList as value
                map.put(sortedWord, new ArrayList<>());
            } 

            // after if loop, we always get the arrayList value 
            // and add the current word to it
            map.get(sortedWord).add(strs[i]);
        }
        
        // finally we return a new arrayList with the values of our map
        // remember that our map values contain a List object of Strings
        return new ArrayList<>(map.values());

        // Time Complexity: O(n * k log k) 
        // k is the time it takes to iterate using Arrays.sort/toCharArray quick methods
        // Space Complexity: O(n)
    }
}
