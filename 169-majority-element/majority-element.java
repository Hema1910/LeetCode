class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int maj = 0;
        for (int n : nums) {
            if (maj == 0) {
                ans = n;
            }
            maj += n == ans ? 1 : -1;
        }
        return ans;        
    }
}