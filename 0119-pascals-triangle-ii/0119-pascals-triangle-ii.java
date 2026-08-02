class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<>();
        long answer = 1;
        ans.add((int)answer);
        for(int i=1 ; i<=rowIndex ; i++){
            answer = answer*(rowIndex-i+1);
            answer = answer/(i);
            ans.add((int)answer);
        }
        return ans;
    }
}