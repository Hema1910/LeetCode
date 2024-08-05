class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] c1 = new int[1001];
        int[] c2 = new int[1001];
        for (int a : target) {
            ++c1[a];
        }
        for (int a : arr) {
            ++c2[a];
        }
        return Arrays.equals(c1, c2);
    }
}