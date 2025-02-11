import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        Scanner operation = new Scanner(System.in);
        System.out.println("Enter operator");

        String operator = operation.nextLine();

        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Enter first number to calculate: \n");

        double a = firstNumber.nextDouble();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Enter second number to calculate: \n");

        double b = secondNumber.nextDouble();
        
        Calculatrice calculatrice = new Calculatrice();

        System.out.println(calculatrice.calculate(operator, a, b));
    }
}
