package searchMatrixSolution;

public class searchMatrixSolution {

    public static void main(String[] args) {


    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        // lie
        int col = matrix[0].length;
        // hang
        int rol = matrix.length;
        for (int i = 0; i < rol; i++) {
            if (matrix[i][0] > target || matrix[i][col] < target){
                continue;
            }
            int mid = col / 2;
            
        }


        return false;
    }
}
