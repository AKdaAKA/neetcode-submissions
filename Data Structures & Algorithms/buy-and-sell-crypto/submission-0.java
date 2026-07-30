class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i =0; i<prices.length; i++)
        {
            for (int j = i; j < prices.length; j++)
            {
                if (prices[j]-prices[i]>max && i != j)
                {
                    max = prices[j]-prices[i];
                }
            }
        }
        return max;
    }
}
