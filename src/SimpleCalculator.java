public class SimpleCalculator {
    public int addition(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo;
    }
    public int subtraction(int numberOne, int numberTwo)
    {
        return numberOne - numberTwo;
    }
    public int multiplication(int numberOne, int numberTwo)
    {
        return numberOne * numberTwo;
    }
    public int division(int numberOne, int numberTwo)
    {
        return numberOne / numberTwo;
    }
    public static void main(String[] args)
    {
        SimpleCalculator calculator = new SimpleCalculator();




        System.out.println(calculator.addition(numberOne, numberTwo));
        System.out.println(calculator.subtraction(numberOne, numberTwo));
        System.out.println(calculator.multiplication(numberOne, numberTwo));
        System.out.println(calculator.division(numberOne, numberTwo));

    }
}
