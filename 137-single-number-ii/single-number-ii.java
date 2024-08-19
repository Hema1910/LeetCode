class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;   // To keep track of numbers that have appeared once
        int twos = 0;   // To keep track of numbers that have appeared twice
        int threes = 0; // To keep track of numbers that have appeared three times

        for (int num : nums) {
            // Update `twos` with bits that were previously in `ones` and now appear again
            twos |= ones & num;
            // Update `ones` with current number
            ones ^= num;
            // Calculate `threes` where `ones` and `twos` have bits set
            threes = ones & twos;
            // Remove `threes` from `ones` and `twos` since the numbers appearing three times should be discarded
            ones &= ~threes;
            twos &= ~threes;
        }

        return ones; // `ones` will hold the number that appears exactly once
    }
}
