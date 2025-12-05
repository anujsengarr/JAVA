public class first {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//Ques input
System.out.println("Enter your name");
String name = sc.nextLine();  // ← Ye line missing thi
System.out.println("Welcome, " + name + "!");

Ques check the  even odd
int x = sc.nextInt();
if( x%2==0 ) {
System.out.println("even number");
} else{
System.out.println("odd number");
}

Ques-3  function method banana
public class First {
    int sum(int a, int b)
    {
        System.out.println(a+b);
        return a+b;

    }
    public static void main(String[] args) {
    First F = new First();
    F.sum(5,6);


os,eng,network,cpi8 in microsoft
instance variable types
create the method,object,class how to call it
method call,class banana,variable type 4 life and scope

}


}

import java.util.Scanner;
 public class First {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

1.	Write a Java program to print all natural numbers from 1 to n.




        System.out.print("Enter the value of number ");
        c
        int i = 1;

        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }
        while loop

2.	Write a Java program to print all natural numbers in reverse (from n to 1)


        System.out.print("Enter the value of n");
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        while loop
3.	Write a Java program to print all natural numbers in reverse (from n to 1)
    char al= 'a';
 while (al <= 'z') {
 System.out.println(al);
al++;
  }
4.	Write a Java program to print all even numbers between 1 to 100. – using while loop

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        5.	Write a Java program to print all odd number between 1 to 100.

        int i=1;
        while(i<=100){
            if (i%2!=0){
                System.out.println(i);
               }
               i++;
        }

        
6.	Write a Java program to find sum of all natural numbers between 1 to n.

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;  
            i++;
        }
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}

//pattern ques
int n=5;
for(int i=1; i<=n; i++ ){
        for(int j=1; j<=i; j++){
             if(j==1 || i==n||j==i){
                System.out.print("*"); 
             }else{
                System.out.print(" ");
             }
         }
           System.out.println();
        }  
}
}