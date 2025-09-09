import java.util.Scanner;

public class pro4 {

    static void unipolarNRZ(int[] data) {
        System.out.println("Unipolar NRZ Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("+1 ");
            else System.out.print("0 ");
        }
        System.out.println();
    }

    static void polarNRZ(int[] data) {
        System.out.println("Polar NRZ Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("+1 ");
            else System.out.print("-1 ");
        }
        System.out.println();
    }

    static void manchester(int[] data) {
        System.out.println("Manchester Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("+1, -1  ");
            else System.out.print("-1, +1  ");
        }
        System.out.println();
    }

    static void differentialManchester(int[] data) {
        System.out.println("Differential Manchester Encoding:");
        int lastLevel = +1; // Assume starting with +1
        for (int bit : data) {
            if (bit == 0) {
                // Transition at start, then mid
                lastLevel = -lastLevel;
                System.out.print((lastLevel == 1 ? "+1, -1  " : "-1, +1  "));
            } else {
                // No transition at start, only mid
                System.out.print((lastLevel == 1 ? "+1, -1  " : "-1, +1  "));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bits in the data: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the binary data bits (0s and 1s):");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        System.out.println("\nChoose a line coding technique:");
        System.out.println("1. Unipolar NRZ");
        System.out.println("2. Polar NRZ");
        System.out.println("3. Manchester");
        System.out.println("4. Differential Manchester");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> unipolarNRZ(data);
            case 2 -> polarNRZ(data);
            case 3 -> manchester(data);
            case 4 -> differentialManchester(data);
            default -> System.out.println("Invalid choice. Please select between 1 and 4.");
        }

        sc.close();
    }
}
