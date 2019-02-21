package test.cenfotec.katas.numerosromanos;

import cenfotec.katas.numerosromanos.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    @Test
    public void testConvertRN1() {
        int num1 = 1;
        int num2 = 9;
        int num3 = 51;
        int num4 = 97;
        int num5 = 458;
        int num6 = 1005;
        int num7 = 1499;

        String res1 = Converter.convert(num1);
        String res2 = Converter.convert(num2);
        String res3 = Converter.convert(num3);
        String res4 = Converter.convert(num4);
        String res5 = Converter.convert(num5);
        String res6 = Converter.convert(num6);
        String res7 = Converter.convert(num7);

        assertEquals("I", res1, "Should return I");
        assertEquals("IX", res2, "Should return IX");
        assertEquals("LI", res3, "Should return LI");
        assertEquals("XCVII", res4, "Should return XCVII");
        assertEquals("CDLVIII", res5, "Should return CDLVIII");
        assertEquals("MV", res6, "Should return MV");
        assertEquals("MCDXCIX", res7, "Should return MCDXCIX");
    }
}
