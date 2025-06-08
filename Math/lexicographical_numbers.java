class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        // Iterate to n numbers
        int curr = 1; 
        for (int i = 1; i <= n; i++) {
            result.add(curr);
            
            if (curr * 10 <= n) // if *10 <= limit we can add
            {
                curr *= 10;
            }
            else // we have to decrement to <= limit, then increment 1 digit
            {
                // if greater than or equal to we decrement a degree
                // or if its last number 19 -> 20
                // 9 + 1 = 10, if 20 is in range curr = 20 add then continue
                while (curr % 10 == 9 || curr >= n) {
                    curr /= 10;
                }

                curr++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
// based on len then nums
// 1, 10, 11, 12, 13
// 10%10 0, 11%10 = 1
// 19 -> 20, divide by 10

// iterate from digits 1-> 9
