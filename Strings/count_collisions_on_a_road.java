class Solution {
    public int countCollisions(String directions) {
        int collisions = 0;
        int flag = -1;
        for (char c : directions.toCharArray()) {
            if (c == 'R') {
                flag = flag < 0 ? 1 : flag+1;
            }
            else if (c == 'L') {
                if (flag >= 0) {
                    collisions += flag + 1;
                    flag = 0;
                }
            }
            else if (c == 'S') {
                if (flag > 0) collisions += flag;
                flag = 0;
            }
        }
        
        // Time: O(n)
        // Space: O(1)
        return collisions;
    }
}
