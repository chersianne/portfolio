import java.util.Scanner;

public class Matrix2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("Input 9 elements:");
            int[][] matrix = new int[3][3];

            for(int r=0; r < matrix.length; r++){
                for(int c=0; c < matrix.length; c++){
                    matrix[r][c] = sc.nextInt();
                }
            }

            //display table n row sums
            System.out.println("\nHere are the Numbers and the required outputs:");
            System.out.printf("                             " + "Row Sum");

            int[] colSum = new int[3];
            for (int r = 0; r < matrix.length; r++) {
                int rowSum = 0;
                for (int c = 0; c < matrix.length; c++){
                    System.out.printf("%10d", matrix[r][c]);
                    rowSum += matrix []
                }
            }
  
}
