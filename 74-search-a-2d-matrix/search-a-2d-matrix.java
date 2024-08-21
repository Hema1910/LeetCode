class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean a=false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==target){
                 a=true ;
                }
               // else{
                 // a=false  ;
               // }
            }
        }
        return a;
    }
}