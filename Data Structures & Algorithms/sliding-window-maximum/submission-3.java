class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();

        int[] result = new int[nums.length - k +1];
        int idx = 0;

        for(int i = 0; i < nums.length; i++){

            while(!dq.isEmpty() && (dq.getFirst() <= i-k || nums[dq.getLast()] < nums[i])){
                if(dq.getFirst() <= i-k){
                    dq.removeFirst();
                }else{
                    dq.removeLast();
                }
                
            }
            
            //if(dq.empty() || nums[dq.get)
            dq.addLast(i);

            if(i >= k-1){
                result[idx++] = nums[dq.getFirst()];
            }
            
        }

        return result;
    }
}
