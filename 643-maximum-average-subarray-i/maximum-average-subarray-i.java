class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        double sum=0;
        int s=0;
        for(int e=0;e<nums.length;e++){
            sum=sum+nums[e];
            if(e-s+1==k){
              max=Math.max(max,sum/k);
              sum=sum-nums[s];
              s++;
            }
        }
        return max;
    }
}