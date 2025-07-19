// LeetCode 121: Best Time to Buy and Sell Stock - Single pass with running minimum and maximum profit tracking
// Core Logic: Track minimum price seen so far, calculate profit at each step, update maximum profit
class q121{
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int cost = 0, profit = 0;
        int min = prices[0];
        for (int i = 1;i<prices.length;i++){
            cost = prices[i] - min;
            profit = Integer.max(profit,cost);
            min = Integer.min(min, prices[i]);
        }
        System.out.println(profit);
    }
}