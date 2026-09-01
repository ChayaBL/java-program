<<<<<<< HEAD
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}
=======
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}
>>>>>>> 054a6c2500796ddde17e83bc7cf1f2ad832cb79a
