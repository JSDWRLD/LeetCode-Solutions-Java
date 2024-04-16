class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[left] >= prices[right]){
                // must update left to rights position and then increment right
                left = right;
                right++;
            } else {
                int currentProfit = prices[right] - prices[left];
                if(currentProfit > maxProfit) maxProfit = currentProfit;
                right++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return maxProfit;
    }
}
