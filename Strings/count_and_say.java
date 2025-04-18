class Solution {
    public String countAndSay(int n) {
        // Have 2 sbs
        // at each step build sb2 based off sb1
        // end of each counting
        // add last group
        // then sb1 = sb2
        // final is sb1 to string

        String result = "1";

        for (int k = 2; k <= n; k++) { // n 
            String prev = result;
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int i = 1; i < prev.length(); i++) { // length of string doubles each time
                if (prev.charAt(i) == prev.charAt(i-1)) {
                    count++;
                } else {
                    sb.append(count).append(prev.charAt(i-1));
                    count = 1;
                }
            }

            sb.append(count).append(prev.charAt(prev.length()-1));
            result = sb.toString();
        }

        // Time Complexity: O(2^n)
        // Space Complexity: O(n)
        return result;
    }
}

// Recursive solution
// class Solution {
//     public String countAndSay(int n) {
//         if (n == 1) return "1"; // base case

//         String prev = countAndSay(n-1); 

//         // Length of string grows by 2 at each recursive step
//         // Time Complexity: O(2^n)
//         // Space Complexity: O(2^n)
//         return countAndSayNext(prev);
//     }

//     private String countAndSayNext(String s) {
//         StringBuilder result = new StringBuilder();

//         int count = 1; // start at one 
//         for (int i = 1; i < s.length(); i++) {
//             if (s.charAt(i) == s.charAt(i-1)) {
//                 // same keep counting
//                 count++;
//             } else {
//                 // Diff char, append the prev char and count
//                 result.append(count).append(s.charAt(i-1));
//                 count = 1;
//             }
//         }

//         // Append last group
//         result.append(count).append(s.charAt(s.length()-1));

//         return result.toString();
//     }
// }
