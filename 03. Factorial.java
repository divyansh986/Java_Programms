import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number:");
        int n = sc.nextInt();
        long ans=1;
        for(int i=n; i>0; i--){
            ans=ans*i;
        }
    System.out.println(ans);    
    }
}
