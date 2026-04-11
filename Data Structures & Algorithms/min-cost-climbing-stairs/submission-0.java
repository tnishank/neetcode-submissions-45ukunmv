class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //handle 0, 1 size
        int[] estimate = new int[cost.length+1];

        estimate[0] = 0;
        estimate[1] = 0;

        int n = cost.length;
        for(int i = 2; i < n+1; i++){
            estimate[i] = Integer.min(estimate[i-1]+cost[i-1], estimate[i-2]+cost[i-2]);

        }

        System.out.println(estimate[n]);
        return estimate[n];

    }
}
