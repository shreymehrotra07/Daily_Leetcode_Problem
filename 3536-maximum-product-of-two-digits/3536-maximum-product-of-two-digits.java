class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int arr[] = new int[s.length()];
        int len = arr.length;
        for(int i=0 ; i<len ; i++){
            arr[i] = s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        return arr[len-1]*arr[len-2];
    }
}