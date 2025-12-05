public class arithmaticExample {
    public static void main(String[] args){
        try{
         int num1=10;
        int num2=0;
        int result=num1/num2;
        System.out.println("Result of two number Addition is: " +result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occured: "+e.getMessage());
        }
        int num3=10;
        int num4=2;
        int result1 =num3*num4;
        System.out.println(result1);
        




    }
}