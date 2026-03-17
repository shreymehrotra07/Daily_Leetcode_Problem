class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> a = new ArrayList<Character>();
        s = s.toLowerCase();
        if(s.trim().isEmpty()){
            return true;
        }
        for(int i=0 ; i<s.length() ; i++){
            char a1 = s.charAt(i);
            if(Character.isLetterOrDigit(a1)){
                a.add(a1);
            }
        }
        int left = 0;
        int right = a.size()-1;
        while(left<right){
            if(!a.get(left).equals(a.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}