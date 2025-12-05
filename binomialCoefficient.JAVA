import java.util.Scanner;

public class binomialCoefficient {
     public static int factorial(int num){
        int f=1;
        for (int i=1; i<=num;i++){
            f=f*i;
        }
        return f;
    }
    public static int Binomial(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter First number: ");
        int n=sc.nextInt();
        System.out.print("Enter Secind number: ");
        int r=sc.nextInt();
        int a=factorial(n);//n!/r!(n-r)!
        int b=factorial(r);
        int ab=factorial(n-r);
        int output=a/(b*ab);
        return output;

    }
    public static void main(String[] args) {
        int binomial=Binomial();
        System.out.println("coffecient is : " + binomial);
        
    }
} 
