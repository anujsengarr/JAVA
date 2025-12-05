import java.util.Scanner;

public class checkPrimeOrNot {
    public static boolean Prime(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if (n<=1){
            return false;
        }
        for(int i=2; i<=n-1; i++){
            if (n%i==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean output= Prime();
        if (output){
            System.out.println("Is prime");
        }else{
            System.out.println("Not a prime");
        }
    } 
}