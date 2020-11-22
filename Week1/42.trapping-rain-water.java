/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int len = height.length;
        
        if(height == null || len < 3){
            return 0;
        }

        int[] left = new int[len];
        int[] right = new int[len];
        int[] res = new int[len];
        
        int maxLeft = 0, maxRight = 0;
        for(int i = 0; i < len; i++) {
            maxLeft = Math.max(maxLeft, height[i]);
            left[i] = maxLeft;
        }
        
        for(int i = len - 1; i >= 0; i--) {
            maxRight = Math.max(maxRight, height[i]);
            right[i] = maxRight;
        }
        
        for(int i = 0; i < len; i++) {
            int h = Math.min(left[i], right[i]);
            if(h > height[i]) res[i] = h - height[i];
        }
        
        int water = 0;
        for(int i = 0; i < len; i++) water += res[i];
        return water;
    }
}
// @lc code=end

