class Solution {
    int[] dp;
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Integer.max(nums[0], nums[1]);

        int n = nums.length;
        int[] nums1 = Arrays.copyOfRange(nums, 0, n-1);

        dp = new int[nums1.length];
        dp[0] = nums1[0];
        dp[1] = Integer.max(nums1[0], nums1[1]);
        int op1 = solve(nums1);

        int[] nums2 = Arrays.copyOfRange(nums, 1, n);
        dp = new int[nums2.length];
        dp[0] = nums2[0];
        dp[1] = Integer.max(nums2[0], nums2[1]);
        int op2 = solve(nums2);

        return Integer.max(op1, op2);

    }

    private int solve(int[]nums){
        for(int i = 2; i < nums.length; i++){
            dp[i] = Integer.max(nums[i] + dp[i-2], dp[i-1]);
        }

        return dp[nums.length-1];
    }

}
