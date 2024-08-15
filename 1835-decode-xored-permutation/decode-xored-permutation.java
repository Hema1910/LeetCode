class Solution {
    public int[] decode(int[] encoded) {
           int f = 0;
        int len = encoded.length+1;
        for(int i=1;i<=len;i++){
            f ^= i; 
        }
        for(int i=1;i<len-1;i+=2) f ^= encoded[i];
        
        int[] permutation = new int[len];
        permutation[0] = f;
        for(int i=0;i<len-1;i++){
            permutation[i+1] = permutation[i] ^ encoded[i];
        }
        return permutation;
    }
}