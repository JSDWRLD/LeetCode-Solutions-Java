class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> curr = items.get(i);
            String type = curr.get(0), color = curr.get(1), name = curr.get(2);

            switch (ruleKey) {
                case "type":
                    if (type.equals(ruleValue)) matches++;
                    break;
                case "color":
                    if (color.equals(ruleValue)) matches++;
                    break;
                case "name":
                    if (name.equals(ruleValue)) matches++;
                    break;
                default:
                    break;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1) 
        return matches;
    }
}
