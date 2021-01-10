/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
   public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        // loop through
        final List<int[]> result = new LinkedList<>();
        for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
            if (i == n - 1 || starts[i + 1] > ends[i]) {
                int[] interval = { starts[j], ends[i] };
                result.add(interval);
                j = i + 1;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
// @lc code=end

