import java.util.Scanner;

public class Matrix3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            int[][][] threeDim = new int[2][2][2];
            int total = 0;
            int count = 0;

            System.out.println("Enter the values for 3D Array: ");

            // Loops to accept user input
            for (int l = 0; l < threeDim.length; l++) {
                System.out.println("\nLayer[" + l + "]:");
                for (int r = 0; r < threeDim[l].length; r++) {
                    for (int c = 0; c < threeDim[l][r].length; c++) {
                        System.out.print("Element [" + r +"]["+ c + "]: ");
                        threeDim[l][r][c] = sc.nextInt();

                        total += threeDim[l][r][c];
                        count++;
                    }
                }
            }
            // output
            System.out.println("\nArray has " + count + " number of elements");
            System.out.println("The total is..." + total);

            // loop char again
            System.out.print("\nDo you want to try again? [Y|N] = ");
            again = sc.next().charAt(0);
            System.out.println();

        } while (again == 'y' || again == 'Y');

        sc.close();
    }

}