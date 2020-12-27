/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        // 状态数组，表示字符个数为下标时的方法总数
        int[] dp = new int[n + 1];
        dp[0] = 1; // 特殊值，根据转移方程获得
        dp[1] = 1; // 已过滤起始 0 的 case
        for (int i = 1; i < n; i++) {
            //'ab'
            char a = s.charAt(i - 1);
            char b = s.charAt(i);
            if (a == '1' || a == '2' && b < '7') {
                if (s.charAt(i) == '0') {
                    //如果是20、10
                    dp[i + 1] = dp[i - 1];
                } else {
                    //如果是11-19、21-26
                    dp[i + 1] = dp[i] + dp[i - 1];
                }
            } else if (b == '0') {
                //如果是0、30、40、50, 比如 150 是无法编码的，因为 0 无编码，50 也没有编码
                return 0;
            } else {
                //i-1和i无法构成一个字母
                dp[i + 1] = dp[i];
            }
        }
        return dp[n];
    }
}
// @lc code=end

