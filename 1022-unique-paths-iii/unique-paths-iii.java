class Solution {
    int count=0;
    public void solve(int[][] grid,int n,int m,int row,int col){
        if(row==-1||col==-1||row==n||col==m||grid[row][col]==-1){
            return;
        }
        if(grid[row][col]==2){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==0){
                        return;
                    }
                }
            }
            count++;
            return;
        }
        else{
            int temp=grid[row][col];
            grid[row][col]=-1;
            solve(grid,n,m,row,col+1);
            solve(grid,n,m,row+1,col);
            solve(grid,n,m,row-1,col);
            solve(grid,n,m,row,col-1);
            grid[row][col]=temp;
        }
    }
    public int uniquePathsIII(int[][] grid) {
        int row=0;
        int col=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        solve(grid,n,m,row,col);
        return count;
    }
}