import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix Addition
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        int[][] product = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix Addition
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        int[][] product = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
