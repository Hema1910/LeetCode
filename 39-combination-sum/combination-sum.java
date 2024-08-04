class Solution {
    public void solve(int[] candidates,int target,int i,List<Integer> list,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(target<0||i>=candidates.length){
            return;
        }
        else{
            list.add(candidates[i]);
            solve(candidates,target-candidates[i],i,list,result);
            list.remove(list.size()-1);
            solve(candidates,target,i+1,list,result);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(candidates,target,0,list,result);
        return result;
    }
}