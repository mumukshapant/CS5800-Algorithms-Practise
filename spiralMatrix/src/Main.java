public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix obj = new SpiralMatrix();
        obj.spiralOrder(matrix);
    }
}