package test.org.bonilla.katas.caesarcipher;

import org.bonilla.katas.caesarcipher.CaesarCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaesarCipher {
    @Test
    public void testEncrypt() {
        String c = "Xing";

        String res = CaesarCipher.encrypt(c, 4);

        assertEquals("Bmrk", res, "Should return Bmrk");
    }

    @Test void testDecrypt() {
        String c = "Bmrk";

        String res = CaesarCipher.decrypt(c, 4);

        assertEquals("Xing", res, "Should return Xing");
    }
}
