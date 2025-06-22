class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> temp = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c);
            if (sb.length() == k) {
                temp.add(sb.toString());
                sb.setLength(0);
            }
        }

        if (sb.length() != 0) {
            while (sb.length() < k) {
                sb.append(fill);
            }
            temp.add(sb.toString());
        }

        String[] result = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
