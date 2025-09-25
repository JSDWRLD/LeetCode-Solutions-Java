class Solution {
    private class Transaction {
        public String name;
        public int startTime;
        public int amount;
        public String city;
        public String original;
        
        public Transaction(String s) {
            String[] split = s.split(",");
            name = split[0];
            startTime = Integer.parseInt(split[1]);
            amount = Integer.parseInt(split[2]);
            city = split[3];
            original = s;
        }
    }

    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        Transaction[] t = new Transaction[n];
        for (int i = 0; i < n; i++) { // o(n)
            t[i] = new Transaction(transactions[i]);
        }
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) { // o(n)
            Transaction curr = t[i];

            boolean invalid = false;
            if (curr.amount > 1000) {
                invalid = true;
            }

            if (!invalid) { 
                // check same name, and start of curr.endTime >= startTime
                for (int j = 0; j < n; j++) { // o(n)
                    if (i == j) continue;

                    Transaction next = t[j];
                    if (!curr.name.equals(next.name) || curr.city.equals(next.city)) continue;

                    if (Math.abs(curr.startTime - next.startTime) <= 60) {
                        invalid = true;
                        break;
                    }
                }
            }

            if (invalid) result.add(curr.original);
        }

        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        return result;
    }
}
