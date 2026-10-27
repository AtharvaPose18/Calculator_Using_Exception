import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String y="yes";
        try{
            do{
                try{
                    System.out.println("\n1.Addition");
                    System.out.println("2.Subtraction");
                    System.out.println("3.Multiplication");
                    System.out.println("4.Division");
                    System.out.println("5.Exit");
                    System.out.print("Enter your choice:");
                    int choose=sc.nextInt();
                    if(choose==5){
                        System.out.println("Thanks for using the calculator!");
                        break;
                    }
                    if(choose<1||choose>5){
                        System.out.println("Please enter a valid choice!");
                        continue;
                    }
                    System.out.print("Enter first number:");
                    double a=sc.nextDouble();
                    System.out.print("Enter second number:");
                    double b=sc.nextDouble();
                    switch(choose){
                        case 1:
                            System.out.println("Addition:"+(a+b));
                            break;
                        case 2:
                            System.out.println("Subtraction:"+(a-b));
                            break;
                        case 3:
                            System.out.println("Multiplication:"+(a*b));
                            break;
                        case 4:
                            if(b==0){
                                throw new ArithmeticException("Cannot divide by zero!");
                            }
                            System.out.println("Division:"+(a/b));
                            break;
                    }
                } catch(InputMismatchException e){
                    System.out.println("Invalid input! Please enter numbers.");
                    sc.nextLine();
                    continue;
                } 
                catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.print("Do you want to try again(yes/no)?");
                sc.nextLine();
                y=sc.nextLine();
            } while (y.equalsIgnoreCase("yes"));
        } finally {
            sc.close();
            System.out.println("Calculator closed");
        }
    }
}
