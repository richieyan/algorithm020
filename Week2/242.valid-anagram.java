/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            Integer count = charMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            count = count - 1;
            charMap.put(c, count);
        }
        return true;
    }
}
// @lc code=end

