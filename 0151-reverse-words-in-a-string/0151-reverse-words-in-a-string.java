class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=a.length-1 ; i>=0 ; i--){
            res.append(a[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}