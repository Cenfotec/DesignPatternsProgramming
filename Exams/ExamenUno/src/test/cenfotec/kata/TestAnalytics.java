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

    @Test
    public void masLargaAlphabeticalTest() {
        String[] words = new String[]{"leche", "arroz", "agua"};

        String[] res = Analytics.masLarga(words);

        assertArrayEquals(new String[]{"arroz", "leche"}, res, "Should return: arroz, leche");
    }

    @Test
    public void masCortaTest() {
        String[] words = new String[]{"casa", "casita", "casototota"};
        String[] words2 = new String[]{"casa", "mia", "cosa", "ala"};

        String[] res = Analytics.masCorta(words);
        String[] res2 = Analytics.masCorta(words2);

        assertArrayEquals(new String[]{"casa"}, res, "Should return: casa");
        assertArrayEquals(new String[]{"mia", "ala"}, res2, "Should return: mia, ala");
    }

    @Test
    public void masCortaAlphabeticalTest() {
        String[] words = new String[]{"hola", "bebe", "cero", "alpaca"};

        String[] res = Analytics.masCorta(words);

        assertArrayEquals(new String[]{"bebe", "cero", "hola"}, res, "Should return: bebe, cero, hola");
    }

    @Test
    public void primeraMasLarga() {
        String[] words = new String[]{"casa", "cosa", "ver"};

        String[] res = Analytics.primeraMasLarga(words);

        assertArrayEquals(new String[]{"casa"}, res, "Should return: casa");
    }

}
