class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        if(nums.length == 0) return 0;

        return solve(nums, 0);
    }

    public int solve(int[] nums, int i){
        if(i >= nums.length) return 0;

        if(dp[i] != -1) return dp[i];

        dp[i] = Integer.max(nums[i] + solve(nums, i+2), solve(nums, i+1));

        return dp[i];
    }
}
