class Solution {
    public boolean isIsomorphic(String s, String t) {
      if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (mapS.containsKey(charS) && !mapT.containsKey(charT)) return false;
            if (!mapS.containsKey(charS) && mapT.containsKey(charT)) return false;
            
            if (!mapS.containsKey(charS) && !mapT.containsKey(charT)) {
                mapS.put(charS, i);
                mapT.put(charT, i);
            } else {
                if (!mapS.get(charS).equals(mapT.get(charT))) return false;
                mapS.put(charS, i);
                mapT.put(charT, i);
            }
        }
        return true;  
    }
}