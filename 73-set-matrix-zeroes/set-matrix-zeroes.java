class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        //create row & column marker [sets true if corresponding to it exist a single 0]

        boolean rowMark[] = new boolean[m];
        boolean colMark[] = new boolean[n];

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(matrix[i][j] == 0){
                    rowMark[i] = true;
                    colMark[j] = true;
                }
            }
        }
         for(int i = 0; i< m; i++){
            for(int j = 0; j<n; j++){
                if(rowMark[i] || colMark[j]){
                     matrix[i][j] = 0;
                }
            }
         }

   
   
   
    }
    }
