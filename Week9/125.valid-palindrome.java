/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(arr[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(arr[right])) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
// @lc code=end

