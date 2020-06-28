/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify 
the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

*/

public class rotate48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            for (int p = i; p < j; p++) {
                int q = n - 1 - p;
                int temp = matrix[i][p];
                matrix[i][p] = matrix[q][i];
                matrix[q][i] = matrix[j][q];
                matrix[j][q] = matrix[p][j];
                matrix[p][j] = temp;
            }
        }
    }
}