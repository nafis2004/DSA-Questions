class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n = matrix.length;
       int m = matrix[0].length;
        //Consider the matrix as an sorted linear array in which low is 0-index & high is (m*n-1)
       int low = 0;
       int high = (m * n) - 1;
       if(matrix.length == 0){
        return false;
       }
       while(low <= high){
        int mid = low+(high-low)/2;
       if(matrix[mid/m][mid%m] == target){
        return true;
       }
       if(matrix[mid/m][mid%m] < target){
            low = mid+1;
       }else{
           high = mid-1;
        }
       }
       return false;
    }
}