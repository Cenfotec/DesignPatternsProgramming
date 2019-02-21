package cenfotec.katas.cartas;

import java.util.Arrays;
import java.util.stream.Stream;

public class DispensadorCartas {
    private String[] paloNegras = new String[]{"♦", "♣", "♥", "♠"};
    private String[] paloBlancas = new String[]{"♢", "♧", "♡", "♤"};
    private String[] cartas = new String[]{"AS", "2", "3", "4", "5", "6", "7",
                                           "8", "9", "10", "Jota", "Quina", "Ka"};

    public DispensadorCartas() {}

    public String[][] repartir(int cartas, int jugadores) {
        String[][] res = new String[jugadores][cartas];

        for (int i = 0; i < jugadores; i++) {
            for (int j = 0; j < cartas; j++) {
                res[i][j] = getRandomCarta() + getRandomPalo();
            }
        }
        return res;
    }

    public String getRandomPalo() {
        String[] palos = Stream.concat(Arrays.stream(paloNegras), Arrays.stream(paloBlancas))
                .toArray(String[]::new);
        int rand = (int)(Math.random() * 8 + 0);
        return palos[rand];
    }

    public String getRandomCarta() {
        int rand = (int)(Math.random() * cartas.length + 0);
        return cartas[rand];
    }
}
