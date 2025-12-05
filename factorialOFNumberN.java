import java.util.Scanner;

public class factorialOFNumberN {
     public static int factorial(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;

    }
    public static void main(String[] args) {
        int result = factorial();
        System.out.println("factorial is: " + result);
    }
}