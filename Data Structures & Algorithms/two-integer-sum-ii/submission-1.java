class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length-1;
       // System.out.println(numbers[3]);
        
        while(l < r){
            int curSum = numbers[l] + numbers[r];
            if( curSum == target){
                return new int[]{l+1, r+1};
            }

            if(curSum < target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
}
