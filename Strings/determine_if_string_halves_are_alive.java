class Solution {
    public boolean halvesAreAlike(String s) {
        int firstCount = 0, secondCount = 0;
        int first = 0, second = s.length()/2;

        for (int i = 0; i < s.length()/2; i++) {
            char temp1 = Character.toLowerCase(s.charAt(first));
            char temp2 = Character.toLowerCase(s.charAt(second));
            if (temp1 == 'a' || 
                temp1 == 'e' || 
                temp1 == 'i' || 
                temp1 == 'o' || 
                temp1 == 'u') firstCount++;
            if (temp2 == 'a' || 
                temp2 == 'e' || 
                temp2 == 'i' || 
                temp2 == 'o' || 
                temp2 == 'u') secondCount++;

            first++;
            second++;
        }

        // Time Complexity: O(n)
        // Space Complextiy: O(1)
        return firstCount == secondCount;
    }
}
