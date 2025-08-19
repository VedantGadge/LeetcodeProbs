public class q746 {
    
    // static int f(int[] cost , int i){
    //     if (i <= 1) {
    //     return cost[i];
    // }
    //     return cost[i] + Math.min(f(cost, i-1), f(cost, i-2));   
    // }
    
    static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        //Base case 
        int prev2 = cost[0];
        int prev1 = cost[1];

        for(int i = 2;i < n;i++){
            int current = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return Math.min(prev1,prev2);




        // return Math.min(f(cost, cost.length - 1), f(cost, cost.length - 2));
    }
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        int minCost = minCostClimbingStairs(cost);
        System.out.println(minCost);
    }
}
