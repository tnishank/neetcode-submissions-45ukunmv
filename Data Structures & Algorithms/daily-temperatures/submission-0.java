class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            if(stack.isEmpty()){
                stack.push(new int[]{temperatures[i], i});
                continue;
            }

            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                result[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
