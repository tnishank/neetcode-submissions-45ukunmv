class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int longest = 1;
        for(int num: nums){
            if(set.contains(num-1)){
                continue;
            }
            int length = 1;
            while(set.contains(num+length)){
                length++;
            }
            longest = Integer.max(longest, length);
        }
        return longest;
    }
}
