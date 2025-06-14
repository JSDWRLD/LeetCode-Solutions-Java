class Solution {
    public int minMaxDifference(int num) {
        String s1 = Integer.toString(num);
        String s2 = s1;
        int n = s1.length();

        int i = 0;
        while (i < n && s1.charAt(i) == '9') i++;

        if (i < n) s1 = s1.replace(s1.charAt(i), '9');

        s2 = s2.replace(s2.charAt(0),'0');
        int max = Integer.parseInt(s1);
        int min = Integer.parseInt(s2);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return max - min;
    }
}
