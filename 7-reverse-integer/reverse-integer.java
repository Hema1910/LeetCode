public class Solution {
    public int reverse(int x) {
        long reversed = 0; // Use long to handle overflow
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0; // If overflow occurs, return 0
            }
        }
        return (int) reversed;
    }

   
}
