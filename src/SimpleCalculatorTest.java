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


}