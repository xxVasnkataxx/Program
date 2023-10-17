import java.util.Scanner;

public class SimpleCalculator {

    public int addition(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public int division(int numberOne, int numberTwo) {
    try{
        return numberOne / numberTwo;
    }
    catch(Exception exception) {
        System.out.println(exception);
            return 0;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);


        int numberOne = scanner.nextInt();


        int numberTwo = scanner.nextInt();

        System.out.println("Addition: " + calculator.addition(numberOne, numberTwo));
        System.out.println("Subtraction: " + calculator.subtraction(numberOne, numberTwo));
        System.out.println("Multiplication: " + calculator.multiplication(numberOne, numberTwo));
        System.out.println("Division: " + calculator.division(numberOne, numberTwo));

        // Close the scanner when you're done with it.
        scanner.close();
    }
}