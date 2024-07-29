class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> seen = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String[] split2 = split[0].split("\\+");
            String temp = split2[0].replace(".", "") + "@" + split[1];
            seen.add(temp);
        }

        // Time Complexity: O(n * m)
        // Space Complexity: O(m)
        return seen.size();
    }
}
