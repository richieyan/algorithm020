/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // notice "have exactly one solution, and you may not use the same element twice"
        // so target - a include in array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            Integer idx = map.get(value);
            if(idx != null && i!=idx){
                int[] ret = {i, idx};
                return ret;    
            }
        }
        return new int[0];
    }
}
// @lc code=end

