public class RotateImage {

        public void rotate(int[][] matrix) {
            int n = matrix.length;
// Let IP MAtrix be ::
            // 1 2 3
            // 4 5 6
            // 7 8 9

            //STEP 1 - Transpose  :
            // 1 4 7
            // 2 5 8
            // 3 6 9

            // STEP 2 - SWAP - After we have the Transpose, we have to swap the first column elements with last column elements , except the middle column
            // Swap (1,7) , (2,8) , (3,9) . We get ::

            // 7 4 1
            // 8 5 2
            // 9 6 3
System.out.println("INPUT MATRIX IS : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }

            //Transpose

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            System.out.println("TRANSPOSE MATRIX IS : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }

            //SWapping
            for(int i=0; i<n ; i++)
            {
                for(int j =0 ;j<n/2 ;j++)
                {
                    int temp= matrix[i][j];
                    matrix[i][j]= matrix[i][n-1-j];
                    matrix[i][n-1-j]= temp;
                }
            }



            System.out.println("OUTPUT MATRIX IS : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }


        }

}



