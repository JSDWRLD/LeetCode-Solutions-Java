class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        int sLen = s.length(), aLen = a.length(), bLen = b.length();
        List<Integer> aStartI = new ArrayList();
        List<Integer> bStartJ = new ArrayList();

        for (int i = 0; i <= sLen - aLen; i++) {
            if (s.substring(i, i+aLen).equals(a)) aStartI.add(i);
        }
        for (int i = 0; i <= sLen - bLen; i++) {
            if (s.substring(i, i+bLen).equals(b)) bStartJ.add(i);
        }

        List<Integer> res = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < aStartI.size(); i++) {
            int currIndex = aStartI.get(i);

            // skip the "j" indices that are out of the range anyways
            while (j < bStartJ.size() && bStartJ.get(j) < currIndex - k) j++;
            
            // We just need one "j" index to validate our start index
            if (j < bStartJ.size() && Math.abs(bStartJ.get(j) - currIndex) <= k) {
                res.add(currIndex);
            }
        }

        // Time: O(n)
        // Space: O(n)
        return res;
    }
}
