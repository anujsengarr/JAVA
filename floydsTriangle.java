import java.util.Scanner;

public class floydsTriangle {
    public static void floyd(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r=sc.nextInt();
        int counter=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
        }
    public static void main(String[] args) {
        floyd();
    }

}