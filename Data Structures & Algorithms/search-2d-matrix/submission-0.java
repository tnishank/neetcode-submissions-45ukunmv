class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchUtil(matrix, 0, matrix.length * matrix[0].length -1 , target);
    }

    public boolean searchUtil(int[][] matrix, int low, int high, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if (low < 0 || high >= row*col || low > high) return false;

        int midIndex = (low+high)/2;
        int rowIndex = midIndex / col;
        int colIndex = midIndex % col;

        if(target == matrix[rowIndex][colIndex]){
            return true;
        }

        if(target < matrix[rowIndex][colIndex]){
            return searchUtil(matrix, low, midIndex-1, target);
        }else{
            return searchUtil(matrix, midIndex+1, high, target);
        }

    }
}
