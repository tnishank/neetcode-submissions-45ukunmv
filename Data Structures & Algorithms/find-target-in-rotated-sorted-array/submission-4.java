class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        return helper(nums, 0, nums.length-1, target);
    }

    private int helper(int[] nums, int low, int high, int target) {
        
        while(low <= high){

           int mid = (low + high)/2;

            if(nums[mid] == target){
                return mid;
            }

           if(nums[low] <= nums[mid]){
                if(target > nums[mid] || target < nums[low]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }

           }else{

                if(target < nums[mid] || target > nums[high]) {
                    high = mid-1;
                }else{
                    low = mid+1;
                }

           }
        }

        return -1;
    }
}
