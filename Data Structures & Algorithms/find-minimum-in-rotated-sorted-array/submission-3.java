class Solution {
    public int findMin(int[] nums) {
        return helper(nums, 0, nums.length-1);
        
    }

    private int helper(int[] nums, int low, int high) {
        if(low > high) return -1;
        if(nums.length == 1) return nums[0];

        int mid = (low + high)/2;
        int n = nums.length;

        if(nums[((n + mid)-1)%n] > nums[mid]){
            return nums[mid];
        }

        if(nums[mid] > nums[high]) {
            return helper(nums, mid+1, high);
        }else{
            return helper(nums, low, mid-1);
        }
    }
}
