class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";
        for(int i=0 ; i<words.length ; i++){
            String str = words[i];
            int sum = 0;
            for(int j=0 ; j<str.length() ; j++){
                char chr = str.charAt(j);
                int index = chr-'a';
                int weight = weights[index];
                sum += weight;
            }
            char c = (char) ('z'- sum%26);
            result+=c;
        }
        return result;
    }
}