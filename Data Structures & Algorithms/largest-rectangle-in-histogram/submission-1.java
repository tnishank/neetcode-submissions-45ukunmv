class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] leftArray = new int[heights.length];
        int[] rightArray = new int[heights.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < heights.length; i++){
            leftArray[i] = -1;

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                leftArray[i] = stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        for(int i = heights.length-1; i>=0; i--){
            rightArray[i] =  heights.length;

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                rightArray[i] = stack.peek();
            }

            stack.push(i);
        }
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++){
            leftArray[i]++;
            rightArray[i]--;
            maxArea = Math.max(maxArea, heights[i] * (rightArray[i] - leftArray[i] + 1));
        }

        return maxArea;
    }
}
