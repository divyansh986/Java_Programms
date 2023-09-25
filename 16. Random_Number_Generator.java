import java.util.Random;
import java.util.Scanner;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Random Number Generator");
        System.out.println("Enter the Min Value:");
        int min = sc.nextInt();
        System.out.println("Enter the Max Value:");
        int max = sc.nextInt();
        
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        
        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
    }
}
