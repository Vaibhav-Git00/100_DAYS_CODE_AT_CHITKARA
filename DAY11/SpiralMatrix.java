import java.util.Scanner;

public class SpiralMatrix {

    public static void generateSpiralMatrix(int arr[][]) {
        int startrow = 0;
        int endrow = arr.length - 1;
        int startcol = 0;
        int endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            startrow++;

            // right column
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            endcol--;

            // bottom row
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    System.out.print(arr[endrow][j] + " ");
                }
                endrow--;
            }

            // left column
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(arr[i][startcol] + " ");
                }
                startcol++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Creating the matrix
        int[][] spiralMatrix = new int[rows][cols];
        
        // Taking input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                spiralMatrix[i][j] = scanner.nextInt();
            }
        }
        
        // Generating and printing the spiral order
        generateSpiralMatrix(spiralMatrix);
        
        scanner.close();
    }
}
