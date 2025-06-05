class Solution {

    private int[] rep;

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        rep = new int[26];
        for (int i = 0; i < 26; i++) rep[i] = i;

        for (int i = 0; i < s1.length(); i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            sb.append((char)(find(baseStr.charAt(i) - 'a') + 'a'));
        }

        // Time Complexity: O(N + M)
        // Space Complexity: O(1)
        return sb.toString();
    }

    private void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return;

        if (a < b) {
            rep[b] = a;
        } else {
            rep[a] = b;
        }
    }

    private int find(int a) {
        if (rep[a] == a) return a;
        return find(rep[a]);
    }
}
