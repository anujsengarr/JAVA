
public record pattern() {
    public static void main(String[] args) {
        int i=20;
        if (i==10) {
            System.out.println("i is 10;");
        }
            else if(i==15){
                System.out.println("i is 15"); 
            }
            else if (i==20){
                System.out.println("i is 20");
 }
 else{
    System.out.println("i is not present");
 }
    System.out .println System is class
//print ln is method  method ko called . se karte h

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current temperature (in °C): ");
        int temp = sc.nextInt();
        if (temp >= 15 && temp <= 30) {
            System.out.println("Temperature is " + temp + "°C → Safe for outdoor activities ");
        } else {
            System.out.println("Temperature is " + temp + "°C → Not safe for outdoor activities ");
        }

        sc.close();

    }
}



