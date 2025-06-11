class Solution {
    public String[] shortestSubstrings(String[] arr) {
        HashMap<String, Integer> subFreq = new HashMap<>();
        for (String curr : arr) {
            int currLen = curr.length();
            
            HashSet<String> subs = new HashSet<>();
            for (int j = 0; j < currLen; j++) {
                for (int k = j+1; k <= currLen; k++) {
                    subs.add(curr.substring(j,k));
                }
            }

            for (String sub : subs) {
                subFreq.put(sub, subFreq.getOrDefault(sub,0)+1);
            }
        }

        String[] res = new String[arr.length];
        // After processing check against freqs 
        for (int i = 0; i < arr.length; i++) {
            String curr = arr[i];
            int currLen = curr.length(); // Len
            
            HashSet<String> subs = new HashSet<>();
            for (int j = 0; j < currLen; j++) {
                for (int k = j+1; k <= currLen; k++) {
                    subs.add(curr.substring(j,k));
                }
            }

            ArrayList<String> possible = new ArrayList<>();
            for (String sub : subs) {
                if (subFreq.get(sub) == 1) possible.add(sub);
            }

            if (possible.size() == 0) res[i] = "";
            else {
                Collections.sort(possible);

                String ans = possible.get(0);
                for (int b = 1; b < possible.size(); b++) {
                    if (possible.get(b).length() < ans.length()) 
                        ans = possible.get(b);
                }

                res[i] = ans;
            }
        }   

        // L = len of longest word in arr
        // S = amount of possible substrings
        // Time Complexity: O(n * L^2 * Log S)
        // Space Complexity: O(S)
        return res;
    }
}

// Iterate thru all words in arr
// then based on len of the curr, we have j and k substring indices
// add to a set, and then add each substring to map, 0 or +1

// after we iterate through all strings in arr
// make substrings using index j and k
// if the substring freq = 1 add to possible

// possible strings for word, if len = 0 then ""
// else sort then get first    
