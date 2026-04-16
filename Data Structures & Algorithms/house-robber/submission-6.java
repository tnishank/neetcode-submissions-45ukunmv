class Solution {
    int[] dp;
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Integer.max(nums[0], nums[1]);

        return solve(nums);

    }

    private int solve(int[]nums){
        for(int i = 2; i < nums.length; i++){
            dp[i] = Integer.max(nums[i] + dp[i-2], i-3 >=0? nums[i] + dp[i-3] : 0);
        }

        return Integer.max(dp[nums.length-1], dp[nums.length-2]);
    }

}
