class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer[]> stack = new Stack<>();
        int n = heights.length;
        int start, height, index, maxArea=0;


        for(int i = 0 ; i < n; i++){
            start = i;
            
            while(!stack.isEmpty() && heights[i] <= stack.peek()[1]){
                index = stack.peek()[0];
                height = stack.peek()[1];
                stack.pop();
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;                
            }
            stack.push(new Integer[]{start, heights[i]});
        }

        while(!stack.isEmpty()){
            index = stack.peek()[0];
            height = stack.peek()[1];
            stack.pop();
            maxArea = Math.max(maxArea, height * (n - index));
        }

        return maxArea;
    }
}
