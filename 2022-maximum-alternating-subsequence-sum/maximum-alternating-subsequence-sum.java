class Solution {
    public long maxAlternatingSum(int[] nums) {
         int n = nums.length;
        long arr[][] = new long[n][2];
        arr[0][0] = nums[0];
        for(int i=1; i<n; i++){
            arr[i][0] = Math.max(arr[i-1][0], arr[i-1][1]+nums[i]);
            arr[i][1] = Math.max(arr[i-1][1], arr[i-1][0]-nums[i]);
        }

        return Math.max(arr[n-1][0], arr[n-1][1]);
    }
}