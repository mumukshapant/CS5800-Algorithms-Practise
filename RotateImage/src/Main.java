public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        RotateImage obj = new RotateImage();
        int[][] board = {
                {1,2,3},{4,5,6},{7,8,9}};

        obj.rotate(board);
    }
}