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
            dp[i] = Integer.max(nums[i] + dp[i-2], dp[i-1]);
        }

        return dp[nums.length-1];
    }

}
