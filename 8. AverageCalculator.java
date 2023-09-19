import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();
        double sum=0;
        for(int i=0; i<N ; i++){
           System.out.println("Input "+ (i+1) + " element:");
           double element = scanner.nextDouble();
           sum=sum+element;
        }
        System.out.println("Average is" + sum/N );
        scanner.close();
    }
}
