class Solution {
    public long countGoodIntegers(int n, int k) {
        List<String> validPalis = new ArrayList<>();
        char[] basePali = new char[n];
        Arrays.fill(basePali, '0');
        backtrack(basePali, 0, k, validPalis);
        // System.out.print(validPalis.toString());

        // Set to store unique freqs
        Set<String> uniquePalindromes = new HashSet<>();
        for (String palindrome : validPalis) {
            int[] currFreq = new int[10]; // 10 possible digits

            for (char ch : palindrome.toCharArray()) {
                currFreq[ch - '0']++;
            }

            StringBuilder currFreqPattern = new StringBuilder();
            for (int i : currFreq) {
                // Convert freq into a letter
                // so if freq for number 5 == 2, at index 5 of the pattern
                // the letter will be c
                currFreqPattern.append((char)(i +'a'));
            }

            // Help us differentiate different frequencies because
            // we will rearrange it anyways.
            uniquePalindromes.add(currFreqPattern.toString());
        }
        

        long totalPerms = factorial(n);
        long result = 0;

        for (String palindrome : uniquePalindromes) {
            long temp = totalPerms; 
            // Divide by the frequency
            for (char c : palindrome.toCharArray()) {
                temp /= factorial(c - 'a');
            }

            // != 'a' means that number 0 has a frequency > 0
            if (palindrome.charAt(0) != 'a') {
                // Remove the palindromes that start with 0
                // from answer
                int zeroCount = palindrome.charAt(0) - 'a' - 1;
                long invalidPerms = factorial(n-1);
                // Removes the numbers we already counted from the invalidPerms
                for (int i = 1; i < palindrome.length(); i++) {
                    invalidPerms /= factorial(palindrome.charAt(i) - 'a');
                }

                invalidPerms /= factorial(zeroCount); // Remove leading zero count
                temp -= invalidPerms;
            }   

            result += temp;
        }   


        // n = digit, m = n+1/2
        // At most 10^m k palindromic integers
        // Time Complexity: O(n log n * 10^m)
        // Space Complexity: O(n * 10^m)
        return result;
    }

    // Build our palindromic string
    private void backtrack(char[] basePali, int index, int k, List<String> validPalis) {
        if (index >= (basePali.length+1)/2) {
            String num = new String(basePali);
            if (Long.parseLong(num) % k == 0) {
                validPalis.add(num);
            }

            return;
        }

        if (index != 0) {
            basePali[index] = '0';
            basePali[basePali.length - 1 - index] = '0';
            backtrack(basePali, index+1, k, validPalis);
        }

        for (char curr = '1'; curr <= '9'; curr++) {
            basePali[index] = curr;
            basePali[basePali.length - 1 - index] = curr;
            backtrack(basePali, index+1, k, validPalis);
        }
    }

    private int factorial(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}
