import java.util.Scanner;

class ControlStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. IF - ELSE
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }


        // 2. FOR LOOP
        System.out.println("\nFor Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 3. WHILE LOOP
        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // 4. DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);


        // 5. SWITCH CASE
        System.out.print("\nEnter a number (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected One");
                break;

            case 2:
                System.out.println("You selected Two");
                break;

            case 3:
                System.out.println("You selected Three");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}