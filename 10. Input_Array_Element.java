import java.util.Scanner;

public class InputArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an integer array of size 'n'
        int[] array = new int[n];

        // Input elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
}
