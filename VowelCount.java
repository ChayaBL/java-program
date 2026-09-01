<<<<<<< HEAD
import java.util.Scanner;

class VowelCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || 
                ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}
=======
import java.util.Scanner;

class VowelCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || 
                ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}
>>>>>>> 054a6c2500796ddde17e83bc7cf1f2ad832cb79a
