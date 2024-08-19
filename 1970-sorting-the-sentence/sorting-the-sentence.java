class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];
        for (String word : words) {
            int i = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            arr[i] = word.substring(0, word.length() - 1);
        }
         return String.join(" ", arr);
    }
}