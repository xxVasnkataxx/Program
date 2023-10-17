import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class SimpleCalculatorTest {
@Test
    void additionBetweenTwoAndFourEqualsSix() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expectedResult = 6;
        int actualResult;
        actualResult = calculator.addition( 2,  4);

    }

    @Test
    void subtractionBetweenFiftyFiveAndFourteenEqualsFortyOne() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expectedResult = 41;
        int actualResult;
        actualResult = calculator.subtraction( 55,  14);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiplicationBetweenTwoAndFive() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expectedResult = 10;
        int actualResult;
        actualResult = calculator.multiplication( 2,  5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divisionBetweenTenAndTwo() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expectedResult = 5;
        int actualResult;
        actualResult = calculator.multiplication( 10,  2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divisionBetweenThreeAndZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expectedResult;
        int actualResult;

    }


}