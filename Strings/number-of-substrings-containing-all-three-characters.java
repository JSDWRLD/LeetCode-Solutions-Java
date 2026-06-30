class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        if (n < 3) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        int left = 0, result = 0;
        map.put(s.charAt(left), 1);
        for (int right = left+1; right < n; right++)
        {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);

            while (checkValid(map))
            {
                result += (n-right);
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1) -> only 3 chars ever
        return result;
    }

    private boolean checkValid(HashMap<Character,Integer> map)
    {
        return (map.getOrDefault('a', 0) > 0)
            && (map.getOrDefault('b', 0) > 0)
            && (map.getOrDefault('c', 0) > 0);
    }
}
