class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return result;
    }
}
