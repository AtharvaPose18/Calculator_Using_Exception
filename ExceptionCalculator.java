import java.util.Scanner;
public class ExceptionCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter first number:");
            double a=sc.nextDouble();
            System.out.print("Enter second number:");
            double b=sc.nextDouble();
            System.out.println("Sum:"+ (a+b));
            System.out.println("Difference:"+(a-b));
            System.out.println("Product:"+(a*b));
            if (b==0){
                System.out.println("Cannot divide by zero!");
            } 
            else{
                System.out.println("Division:"+(a/b));
            }
        } catch (Exception e){
            System.out.println("Invalid input! Please enter numbers");
        } 
        finally{
            sc.close();
            System.out.println("Calculator closed.");
        }
    }
}
