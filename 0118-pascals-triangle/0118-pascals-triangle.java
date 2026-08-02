class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0) return ans;
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        ans.add(firstrow);
        for(int i=2 ; i<=numRows ; i++){
            List<Integer> row = new ArrayList<>();
            long a = 1;
            row.add((int)a);
            for(int j=1 ; j<i ; j++){
                a = a*(i-j);
                a = a/(j);
                row.add((int)a);
            }
            ans.add(row);
        }
        return ans;
    }
}