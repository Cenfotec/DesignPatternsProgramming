package cenfotec.katas.cartas;

public class Juego {
    public static void main(String[] args) {
        String[][] test = dispensar(4, 2);
        for (int i = 0; i < test.length; i++) {
            System.out.print("\n#" + (i+1) + ": ");
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(test[i][j] + ", ");
            }
        }
    }
    public static String[][] dispensar(int cartas, int jugadores) {
        String[][] res = new DispensadorCartas().repartir(cartas, jugadores);
        return res;
    }
}
