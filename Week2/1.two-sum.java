/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (indexMap.containsKey(v)) {
                return new int[]{indexMap.get(v), i};
            } else {
                indexMap.put(nums[i], i);
            }
        }
        return null;
    }
}
// @lc code=end

