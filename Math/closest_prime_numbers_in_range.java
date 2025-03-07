class Solution {
    public int[] closestPrimes(int left, int right) {

        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) { // O(right - left) call it n
            if (i % 2 == 0 && i > 2) continue;

            // O(sqrt R) a number which is along the range of left to right
            if (isPrime(i)) {
                if (primes.size() != 0 && i <= primes.get(primes.size()-1) + 2) {
                    // This means we found a 2 prime numbers with a dist <= 2;
                    return new int[] {primes.get(primes.size()-1), i};
                }
                primes.add(i);
            }
        }

        if (primes.size() < 2) return new int[] {-1, -1};

        int minDist = Integer.MAX_VALUE;
        int[] ans = new int[2];

        // O(right - left) also space
        for (int i = 1; i < primes.size(); i++) {
            int numOne = primes.get(i-1);
            int numTwo = primes.get(i);
            int dist = numTwo - numOne;
            if (dist < minDist) {
                minDist = dist;
                ans = new int[] {numOne, numTwo};
            }
        }

        // R - L = N
        // Time Complexiy: O(n * sqrt(R))
        // Space Complexity: O(n)
        return ans;
    }

    // Determine if prime
    private boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        // Keep seeing if the current number is divisible by any numbers within
        // this range.
        // Biggest would be sqrt of right number
        for (int divisor = 2; divisor <= (int) Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
