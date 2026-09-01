<<<<<<< HEAD
import java.util.Scanner;

class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } 
        else {
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
=======
import java.util.Scanner;

class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } 
        else {
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
>>>>>>> 054a6c2500796ddde17e83bc7cf1f2ad832cb79a
}