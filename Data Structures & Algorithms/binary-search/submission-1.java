class Solution {
    public int searchUtil(int[] nums, int low, int high, int target){
        if(low > high) return -1;

        int mid = (low + high)/2;

        if(nums[mid] == target){
            return mid;
        }

        if(target < nums[mid]){
            return searchUtil(nums, low, mid-1, target);
        }else {
            return searchUtil(nums, mid+1, high, target);
        }

       // return -1;
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;

        return searchUtil(nums, 0, nums.length - 1, target);
    }
}
