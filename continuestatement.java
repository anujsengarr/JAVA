import java.util.Scanner;

public class continuestatement {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        do{
            System.out.println("enter your number");
            int i=cs.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println("number was : " + i);
        }while(true);
    }
}