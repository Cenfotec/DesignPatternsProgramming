package test.cenfotec.katas.calculator;

import cenfotec.katas.calculator.InvalidNumberSeparatorException;
import cenfotec.katas.calculator.InvalidNumberSizeException;
import cenfotec.katas.calculator.SumCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSumCalculator {
    @Test
    public void testSumString() throws InvalidNumberSeparatorException {
        String number1 = "1,2,3";
        String number2 = "10;12";
        String number3 = "1";
        String number4 = "10,20,30,40,50";

        int result1 = SumCalculator.add(number1);
        int result2 = SumCalculator.add(number2);
        int result3 = SumCalculator.add(number3);
        int result4 = SumCalculator.add(number4);

        assertEquals(6, result1, "Should return 6 as int");
        assertEquals(22, result2, "Should return 22 as int");
        assertEquals(1, result3, "Should return 1 as int");
        assertEquals(150, result4, "Should return 150 as int");
    }

//    @Test
//    public void testSumStringSizeError() {
//        String number = "1,2,3,4";
//
//        Throwable exception = assertThrows(InvalidNumberSizeException.class, () -> SumCalculator.add(number));
//        assertEquals("Exceeding number limit: 3", exception.getMessage());
//    }

    @Test
    public void testSumStringSeparatorError() {
        String number1 = "1&4";
        String number2 = "1!2!3";

        Throwable exception1 = assertThrows(InvalidNumberSeparatorException.class, () -> SumCalculator.add(number1));
        Throwable exception2 = assertThrows(InvalidNumberSeparatorException.class, () -> SumCalculator.add(number1));

        assertEquals("Available separators: , or ;", exception1.getMessage());
        assertEquals("Available separators: , or ;", exception2.getMessage());
    }
}
