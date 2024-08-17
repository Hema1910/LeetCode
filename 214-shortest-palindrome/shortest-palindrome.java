class Solution {
   
    public static String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] prefix = computePrefix(combined);
        int palindromeLength = prefix[prefix.length - 1];
        return rev.substring(0, s.length() - palindromeLength) + s;
    }

    private static int[] computePrefix(String s) {
        int[] prefix = new int[s.length()];
        int j = 0;
        
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = prefix[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            prefix[i] = j;
        }
        return prefix;
    }

}

