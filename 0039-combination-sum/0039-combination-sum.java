class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        solve(0,target,ans,res,candidates);
        return ans;
    }
    public void solve(int idx, int target, List<List<Integer>> ans, List<Integer> res, int[] candidates){
        if (target == 0) {
            ans.add(new ArrayList<>(res));
            return;
        }
        if(idx==candidates.length) return;
        if(candidates[idx]<=target){
            res.add(candidates[idx]);
            solve(idx,target-candidates[idx],ans,res,candidates);
            res.remove(res.size()-1);
        }
        solve(idx+1,target,ans,res,candidates);
    }
}