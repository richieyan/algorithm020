/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array

// 暴力法
     private void moveRight(int[] nums){
        int v = nums[nums.length - 1];
        for(int j=nums.length-1;j>0;j--){
            nums[j] = nums[j-1];
        }
        nums[0] = v;
    }
    public void rotate(int[] nums, int k) {
        // 暴力法
        for(int i=0;i<k;i++){
            moveRight(nums);
        }
    }
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int temp, prev;
        for (int i = 0; i < k; i++) {
            prev = nums[n - 1];
            for (int j = 0; j < n; j++) {
                temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        }
    }
}
// @lc code=end

