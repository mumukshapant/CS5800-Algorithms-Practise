import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        int row = matrix.length, col = matrix[0].length;
        int top = 0 , bottom = row - 1;
        int left = 0 , right = col - 1;
    System.out.print(row+","+ col);
        int size = row * col;

//        while (size > 0)
//        {
//            //TOP ROW
//            for (int i = left; i <= right; i++)
//            {
//                answer.add(matrix[top][i]);
//                size--;
//            }
//            top++;
//
//            //RIGHT
//            for (int i = top; i <= bottom; i++)
//            {
//                answer.add(matrix[i][right]);
//                size--;
//            }
//            right--;
//
//            // BOTTOM
//                for (int i = right; i >= left; i--)
//                {
//                    answer.add(matrix[bottom][i]);
//                    size--;
//                }
//                bottom--;
//
//
//            // LEFT
//                for (int i = bottom; i >= top; i--)
//                {
//                    answer.add(matrix[i][left]);
//                    size--;
//                }
//                left++;
//
//        }

        while(size>0)
        {
            //top
            for(int i=left ; i<=right; i++)
            {
                result.add(matrix[top][i]);
                size--;


            }
            top++;


            //right
            for(int i = top ; i<=bottom ; i++)
            {
                result.add(matrix[i][right]);
                size--;

            }
            right--;



            //bottom
            for(int i = right ; i>=left;i--)
            {
                result.add(matrix[bottom][i]);
                size--;
            }
            bottom -- ;

            //left
            for(int i= bottom ; i>=top ; i--)
            {
                result.add(matrix[i][left]);
                size--;
            }
            left++;

        }





        System.out.print(result);
        return result;
    }
}
