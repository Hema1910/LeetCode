class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length < 2) return nums;
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int[] temp, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, temp, left, mid);
        mergeSort(nums, temp, mid + 1, right);
        merge(nums, temp, left, mid, right);
    }
    private void merge(int[] nums, int[] temp, int left, int mid, int right) {
        System.arraycopy(nums, left, temp, left, right - left + 1);
        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) nums[k] = temp[j++];
            else if (j > right) nums[k] = temp[i++];
            else if (temp[j] < temp[i]) nums[k] = temp[j++];
            else nums[k] = temp[i++];
        }
    }
}
