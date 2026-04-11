class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        int[] profit = new int[nums.length+1];
        profit[1] = nums[0];
        profit[2] = nums[1];

        int n = nums.length;
        for(int i = 3; i < n+1; i++){
            profit[i] = nums[i-1] + Integer.max(profit[i-2], profit[i-3]);
        }

        return Integer.max(profit[n], profit[n-1]);
    }
}
