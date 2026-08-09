class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        generate(s,0,path,res);
        return res;
    }
    public void generate(String s, int index, List<String> path, List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index ; i<s.length() ; i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                generate(s,i+1,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int index,int i){
        while(index<=i){
            if(s.charAt(index)!=s.charAt(i)){
                return false;
            }
            index++;
            i--;
        }
        return true;
    }
}