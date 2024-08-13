class Solution {
    public int findLUSlength(String a, String b) {
    
        int m=a.length();
        int n=b.length();

        int arr[][]=new int[m+1][n+1];

        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                arr[i][j]=0;
            }
        }
       for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    arr[i][j]=1+arr[i-1][j-1];
                }
                else
                {
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
         if(arr[m][n]==m &&m==n)
         {
             return -1;
         }
     
         return(Math.max(m,n));
    }
}