class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int prev = target - nums[i];
            if(prevMap.containsKey(prev)){
                return new int [] {prevMap.get(prev), i};
            }

            prevMap.put(nums[i], i);
        }
        return new int []{-1, -1};
    }
}
