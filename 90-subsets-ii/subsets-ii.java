class Solution {
     public void solve(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<>(list)); // Add the current subset to the result list
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            solve(result, list, nums, i + 1);
            list.remove(list.size() - 1); // Remove the last element to backtrack
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        solve(result, new ArrayList<>(), nums, 0);
        return result;
    }
}