class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;
        for(int i=0 ; i<word.length() ; i++){
            if(word.charAt(i) == Character.toUpperCase(word.charAt(i))){
                uppercase++;
            }
        }
        return uppercase==word.length() || uppercase==0 || (uppercase==1 && word.charAt(0) == Character.toUpperCase(word.charAt(0))) ;
    }
}