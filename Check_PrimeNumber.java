import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number:");
        int n = sc.nextInt();
        int flag=0;
        for(int i=2; i<n; i++){
            if (n%i==0) {
                flag=1;
                System.out.println("Not Prime number");
                break;
            }
        }
        if (flag==0){
            System.out.println("Prime number");
        }
    }
}
