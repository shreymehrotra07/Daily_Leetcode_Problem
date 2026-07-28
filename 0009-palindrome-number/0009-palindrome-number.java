class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int x1 = x;
        while (x > 0) {
            int a = x % 10;
            x = x / 10;
            num = num * 10 + a;
        }
        if (num == x1)
            return true;
        return false;
    }
}