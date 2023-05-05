public class TwoDimensionalArray {
    public static void main(String[] args) {
        // create the two-dimensional array A
        int[][] A = {{11, 16, 21, 26, 31},
                     {12, 17, 22, 27, 32},
                     {13, 18, 23, 28, 33},
                     {14, 19, 24, 29, 34},
                     {15, 20, 25, 30, 35}};
        
        // display Array A
        System.out.println("Array A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        // calculate the sum of the elements in the 3rd row
        int row_sum = 0;
        for (int j = 0; j < A[2].length; j++) {
            row_sum += A[2][j];
        }
        System.out.println("Sum of the elements in the 3rd row: " + row_sum);
        
        // find the largest value in the first column
        int max_col_1 = A[0][0];
        for (int i = 1; i < A.length; i++) {
            if (A[i][0] > max_col_1) {
                max_col_1 = A[i][0];
            }
        }
        System.out.println("Largest value in the first column: " + max_col_1);
        
        // create a One-Dimensional Array B to become the sum of each column from Array A
        int[] B = new int[A[0].length];
        for (int j = 0; j < A[0].length; j++) {
            int col_sum = 0;
            for (int i = 0; i < A.length; i++) {
                col_sum += A[i][j];
            }
            B[j] = col_sum;
        }
        System.out.println("Array B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        // add each element of rows 2 and 3 to replace row 3
        for (int j = 0; j < A[2].length; j++) {
            A[2][j] += A[1][j];
            A[2][j] += A[2][j];
        }
        System.out.println("Array A after adding rows 2 and 3:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        // interchange columns 3 and 4
        for (int i = 0; i < A.length; i++) {
            int temp = A[i][2];
            A[i][2] = A[i][3];
            A[i][3] = temp;
        }
        System.out.println("Array A after interchanging columns 3 and 4:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
                }
                }
                }
                }
