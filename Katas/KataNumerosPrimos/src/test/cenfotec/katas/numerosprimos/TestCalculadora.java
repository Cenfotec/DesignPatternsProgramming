package test.cenfotec.katas.numerosprimos;

import cenfotec.katas.numerosprimos.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCalculadora {

    @Test
    public void testFactoresPrimos() {
        int num1 = 60;

        int[] res1 = Calculadora.factoresPrimos(num1);

        assertArrayEquals(new int[]{2,2,3,5}, res1, "Should return [2, 2, 3, 5]");
    }
}
