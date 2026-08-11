class Solution {

    public void setZeroes(int[][] matrix) {

        boolean firstRow = false;
        boolean firstCol = false;

        // Step 1: Store markers
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {

                    // Preserve original first row / first column
                    if (i == 0) firstRow = true;
                    if (j == 0) firstCol = true;

                    // Use first row & first column as markers
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Update inner matrix
        for (int i = 1; i < matrix.length; i++) {

            for (int j = 1; j < matrix[0].length; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Update first row
        if (firstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Update first column
        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
