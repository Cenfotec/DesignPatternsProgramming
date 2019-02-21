package test.cenfotec.katas.caesar;

import cenfotec.katas.caesar.EncriptaCaesar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEncriptaCaesar {

    @Test
    public void testEncrypt() {
        String c = "Xing";

        String res = EncriptaCaesar.encrypt(c, 4);

        assertEquals("Bmrk", res, "Should return Bmrk");
    }

    @Test void testDecrypt() {
        String c = "Bmrk";

        String res = EncriptaCaesar.decrypt(c, 4);

        assertEquals("Xing", res, "Should return Xing");
    }
}
