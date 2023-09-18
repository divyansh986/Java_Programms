import java.util.Scanner;
class Check_Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String:");
        String S = sc.nextLine();
        int i=0;
        int j=S.length()-1;
        int flag=1;
        while (i<j){
            if (S.charAt(i)==S.charAt(j)){
                i=i+1;
                j=j-1;
                continue;
            }
            else{
                System.out.println("Not Palindrom");
                flag=0;
                break;
            }
        }
        if (flag==1){
        System.out.println("Palindrom");
        }
    }
}
