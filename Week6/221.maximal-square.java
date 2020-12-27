/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
    int n,m;
    public int maximalSquare(char[][] matrix) {
        n = matrix.length;
        if (n == 0) return 0;
        m = matrix[0].length;
        if (m == 0) return 0;
        // 最大矩阵大小，从 1 开始，看看能不能找到
        int maLen = 1;
        return dfs(maLen, matrix,0);
    }

    public int dfs(int maLen, char[][] matrix, int k) {
        for (int i=k; i <= n-maLen; i++) {
            for (int j=0; j <= m-maLen; j++) {
                // 找到了 maLen 的矩形，尝试找 maLen+1 的矩形
                if (judge(maLen, matrix, i, j))
                    return Math.max(maLen*maLen ,dfs(maLen+1, matrix, i)); // 返回最大面积，dfs 开始递归
            }
        }
        return 0;
    }

    // 判断 maLen 的矩阵是否存在，不存在返回 false
    public boolean judge(int maLen, char[][] matrix, int i,int j) {
        if (maLen == 1 && matrix[i][j]=='1') return true;
        for (int k=i; k<i+maLen; k++) {
            for (int h=j; h<j+maLen; h++) {
                if (matrix[k][h]=='0')
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end

