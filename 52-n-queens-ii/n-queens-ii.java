class Solution {
    public static boolean isSafe(int row,int col,char[][] board,int n){
        for(int j=col-1;j>=0;j--){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row+1,j=col-1;i<n&&j>=0;i++,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void solve(char[][] board,int col,int n,List<List<String>> result){
        if(col==n){
            List<String> list= new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str=str+board[i][j];
                }
                list.add(str);
            }
            result.add(list);
            return;
        }
        else{
            for(int row=0;row<n;row++){
                if(isSafe(row,col,board,n)==true){
                    board[row][col]='Q';
                    solve(board,col+1,n,result);
                    board[row][col]='.';
                }
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(board,0,n,result);
        return result.size();
    }
}