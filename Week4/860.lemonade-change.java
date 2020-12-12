/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        int len = bills.length;
        for (int i = 0; i < len; i++) {
            int bill = bills[i];
            if (bill == 5) { // payback=0
                five++;
            } else if (bill == 10) { // paybacke=5
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else { // payback=15 -> 10+5 | 5+5+5
                if (ten > 0 && five > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

