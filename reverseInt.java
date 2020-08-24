/*
Description:
Given a 32-bit signed integer, reverse digits of an integer. If the reversed integer causes overflow, return 0

Result:
Success
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
Memory Usage: 36.5 MB, less than 91.94% of Java online submissions for Reverse Integer.

*/

class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if ( x < 0) {
            negative = true;
            x *= -1;
        }
        long flipped = 0;
        while (x >= 1) {
            int temp = x % 10;
            flipped = flipped * 10 + temp;
            x = x / 10;
        }
        if (flipped >Integer.MAX_VALUE) {
            return 0;
        } else if(negative) {
            flipped *= -1;
        }
        int ans = (int) flipped;
        return ans;
    }
}
