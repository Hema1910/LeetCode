public class Solution {
    public String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Split the string by spaces (this will handle multiple spaces)
        String[] words = s.split("\\s+");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder();
        
        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        // Convert StringBuilder to String and return
        return reversed.toString();
    }
}
