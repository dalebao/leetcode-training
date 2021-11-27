package NC18RotateMatrix;

public class RotateMatrixSolution {

    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        //  暴力解法  i,j 顺时针之后 便到了 j,n-1-i

        // 另外的解法
        // 顺时针旋转90度，相当于 先按对角线 对称更换
        // 再对每一行进行反转

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int tmp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = tmp;
                left++;
                right--;
            }
        }

        return mat;
    }
}
