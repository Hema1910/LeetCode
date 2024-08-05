class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

      
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (mat[i][j] > 0) {
                   
                    int up = (i > 0) ? mat[i - 1][j] : Integer.MAX_VALUE - 10000;

                    int left = (j > 0) ? mat[i][j - 1] : Integer.MAX_VALUE - 10000;

                    
                    mat[i][j] = Math.min(up, left) + 1;
                }
            }
        }

        // Second pass: Bottom-right to top-left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // Check if the element is greater than zero
                if (mat[i][j] > 0) {
                    // Check the element below, if there is no element below,
                    // set to infinity
                    int down = (i < m - 1) ? mat[i + 1][j] : Integer.MAX_VALUE - 10000;

                    // Check the right element, if there is no right element,
                    // set to infinity
                    int right = (j < n - 1) ? mat[i][j + 1] : Integer.MAX_VALUE - 10000;

                    // Take the minimum of the element below and to its
                    // right and add 1
                    int minDistance = Math.min(down, right) + 1;
                    // Update the current element with the minimum of its
                    // value and minDistance
                    mat[i][j] = Math.min(mat[i][j], minDistance);
                }
            }
        }

        return mat;
    }
}