class Solution {
    public int removeElement(int[] nums, int val) {
        int differentNums = nums.length;
        int index = 0;

        while (index < differentNums) {
            if (val == nums[index]) {
                differentNums--;
                if (index+1 >= nums.length) return differentNums;
                for (int j = index + 1; j<nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
            }
            else index++;
        }
        return differentNums;
    }
}