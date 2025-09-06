class Solution {
    public long calculateScore(String s) {
        // make a map char, -> indexes where it exists
        // then iterating left to right
        // get curr, get mirror
        // check if mirror exists
        // if mirror exists and list is not empty then we use
        // else we add 
        Map<Character, List<Integer>> map = new HashMap<>();
        long result = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            char curr = s.charAt(i);
            char mirror = (char) ('a' + ('z' - curr));

            if (map.containsKey(mirror) && !map.get(mirror).isEmpty()) 
            {
                List<Integer> temp = map.get(mirror);
                int closestIndex = temp.remove(temp.size()-1);
                result += (long) (i - closestIndex);
            }
            else 
            {
                // if no mirror is avail
                // create an array list if absent, else add index to list
                if (!map.containsKey(curr)) {
                    map.put(curr, new ArrayList<>());
                }

                map.get(curr).add(i);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
