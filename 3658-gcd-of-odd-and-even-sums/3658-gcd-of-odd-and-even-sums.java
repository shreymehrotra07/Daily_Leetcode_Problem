class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i=0 ; i<n ; i++){
            if(n%2==0){
                sumEven++;
            }
            else{
                sumOdd++;
            }
        }
        return gcd(sumEven,sumOdd);
    }
    public int gcd(int nums1 , int nums2){
        while(nums2!=0){
            int temp = nums2;
            nums2 = nums1%nums2;
            nums1 = temp;
        }
        return nums1;
    }
}