/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int index = 0;
        while (index < len && arr[index] == ' ') {
            index++;
        }

        if (index == len) {
            return 0;
        }

        int sign = 1;
        char firstChar = arr[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }
        int res = 0;
        int preMax = Integer.MAX_VALUE / 10;
        int preMin = Integer.MIN_VALUE / 10;
        int maxLastDigit = Integer.MAX_VALUE % 10;
        int minLastDigit = -(Integer.MIN_VALUE % 10);
        while (index < len) {
            char currChar = arr[index];
            if (currChar > '9' || currChar < '0') {
                break;
            }
            int digit = currChar - '0';
            if (res > preMax || (res == preMax && digit > maxLastDigit)) {
                return Integer.MAX_VALUE;
            }
            if (res < preMin || (res == preMin && digit > minLastDigit)) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (currChar - '0');
            index++;
        }
        return res;
    }
}
// @lc code=end

