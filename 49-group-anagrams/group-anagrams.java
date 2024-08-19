class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sword = new String(ch);
            if (!hmap.containsKey(sword)) {
                hmap.put(sword, new ArrayList<>());
            }
            hmap.get(sword).add(word);
        }
        return new ArrayList<>(hmap.values());
    }
}