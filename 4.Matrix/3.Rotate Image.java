class Solution {
    public void rotate(int[][] matrix) {
        // Reverse each row in the matrix
        for (int[] row : matrix) {
            reverseRow(row);
        }

        int n = matrix.length;
        int m = 0;

        // Perform the swapping
        for (int i = n - 1; i > 0; i--) {
            int k = 0;
            for (int j = n - 1; j > n - 1 - i; j--) {
                int temp = matrix[m][k];
                matrix[m][k] = matrix[j][i];
                matrix[j][i] = temp;
                k++;
            }
            m++;
        }
    }

    private void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
