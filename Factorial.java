<<<<<<< HEAD
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
=======
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
>>>>>>> 054a6c2500796ddde17e83bc7cf1f2ad832cb79a
}