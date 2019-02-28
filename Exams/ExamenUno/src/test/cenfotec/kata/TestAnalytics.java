package test.cenfotec.kata;

import cenfotec.kata.Analytics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAnalytics {
    @Test
    public void masLargaTest() {
        String[] words = new String[]{"casa", "casita", "casototota"};
        String[] words2 = new String[]{"casa", "mia", "cosa"};

        String[] res = Analytics.masLarga(words);
        String[] res2 = Analytics.masLarga(words2);

        assertArrayEquals(new String[]{"casototota"}, res, "Should return: casototota");
        assertArrayEquals(new String[]{"casa", "cosa"}, res2, "Should return: casa, cosa");
    }
}
