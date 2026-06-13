class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";
        for(int i=0 ; i<words.length ; i++){
            String str = words[i];
            int sum = 0;
            for(int j=0 ; j<str.length() ; j++){
                int index = str.charAt(j)-'a';
                sum+=weights[index];
            }
            char c = (char)('z'-sum%26);
            result+=c;
        }
        return result;
    }
}