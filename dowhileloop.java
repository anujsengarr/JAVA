import java.util.Scanner;

public class dowhileloop {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int n=sc.nextInt();
        do{
            System.out.println("hello world");
            count++;
        }while(count<=n);
    }
}