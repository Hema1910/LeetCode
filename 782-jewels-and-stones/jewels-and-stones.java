class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int j=jewels.length();
      int  s=stones.length();
      char []ch=jewels.toCharArray();
      char[]ch1=stones.toCharArray();
      int count=0;
      for(int i=0;i<s;i++){
        for(int k=0;k<j;k++){
            if(ch[k]==ch1[i]){
                count++;
            }
        }

      } 
      return count;
    }
}