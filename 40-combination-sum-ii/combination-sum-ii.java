class Solution {
    public static void solve(int[] candidates,int target,List<Integer> list,List<List<Integer>>result,int start) 
    {
     if(target==0){
        result.add(new ArrayList<>(list));
     }
     else{
        for(int i=start;i<candidates.length;i++){
           if(i>start && candidates[i]==candidates[i-1]) continue;
                if(candidates[start]>target) break;
                list.add(candidates[i]);
                solve(candidates,target-candidates[i],list,result, i+1);
                list.remove(list.size()-1);
        }
     }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,list,result,0);
        return result;
    }
}