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


// 旋转法
private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

// TODO reverse with start&end
private static void reverse(int[] nums, int start, int end) {
    int len = nums.length;
    if (len <= 1) {
        return;
    }
    int times = len / 2;
    for (int i = 0; i < times; i++) {
        swap(nums, i, len - i - 1);
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

