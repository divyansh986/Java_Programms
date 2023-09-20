import java.util.Scanner;
class Largest_Number_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int max=0;
        for(int i=0; i<array.length; i++){
            if (array[i]>max){
            max=array[i];
        }
    }    
    System.out.println("Maximum Element is " + max);    
}

}
