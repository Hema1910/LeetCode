class Solution {
    public static void solve(int[] nums,List<List<Integer>> result,List<Integer> list,boolean[] used){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(used[i]||i>0 && nums[i]==nums[i-1] && !used[i-1])
                continue;
                list.add(nums[i]);
                used[i]=true;
                solve(nums,result,list,used);
                list.remove(list.size()-1);
                used[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        solve(nums,result,list,used);
        return result;
    }
}