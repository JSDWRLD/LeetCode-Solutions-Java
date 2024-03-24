class Solution {
    public boolean isAnagram(String s, String t) {

        // turn strings into character array for sorting
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // sorting characters so theyre all similar regardless of index
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // convert to string because Arrays.Equals is slower than 
        // string methods
        String sOrdered = new String(sChars);
        String tOrdered = new String(tChars);
        
        return sOrdered.equals(tOrdered);
        // Time complexity: o(log n)
        // Space complexity: o(n + m)
    }
}