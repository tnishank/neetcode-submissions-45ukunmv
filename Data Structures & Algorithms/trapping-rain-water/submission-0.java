class Solution {
    public int trap(int[] height) {
        int n = height.length;

        if(n < 3) return 0;

        int[] leftMaxPrefix = new int[n];
        int[] rightMaxSuffix = new int[n];

        leftMaxPrefix[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMaxPrefix[i] = Integer.max(leftMaxPrefix[i-1], height[i]);
        }

        rightMaxSuffix[n-1] = height[n-1];
        for(int i = n-2; i >=0; i--){
            rightMaxSuffix[i] = Integer.max(rightMaxSuffix[i+1], height[i]);
        }

        int result = 0;

        for(int i = 0; i < n; i++){
            result += Integer.min(leftMaxPrefix[i], rightMaxSuffix[i]) - height[i];
        }

        return result;
    }
}
