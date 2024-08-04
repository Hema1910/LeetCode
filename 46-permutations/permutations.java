import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Helper method for permute
    private void permuteHelper(int[] nums, List<List<Integer>> result, int start, int end) {
        if (start == end) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
        } else {
            for (int i = start; i <= end; i++) {
                // Swap elements
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                
                // Recurse
                permuteHelper(nums, result, start + 1, end);
                
                // Swap back (backtrack)
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
            }
        }
    }

    // Main method to generate permutations
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, result, 0, nums.length - 1);
        return result;
    }

    // Test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = sol.permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
