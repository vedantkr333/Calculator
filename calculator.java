import java.util.Scanner;
public class calculator {
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
   char ch='y';
    while(ch=='y'){
            System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
                double result=0;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator\nEnter valid operator and try again");
        }
        System.out.println("Result: " + result);
         System.out.println("Press y if you want to continue calculating");
         ch=scanner.next().charAt(0);
    }
    }

   } 

