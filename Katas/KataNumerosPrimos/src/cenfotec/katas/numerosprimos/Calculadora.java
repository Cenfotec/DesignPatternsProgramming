package cenfotec.katas.numerosprimos;

public class Calculadora {

    public static int[] factoresPrimos(int num) {
        String fp = "";
        int copyNum = num;

        for (int i = 2; i <= copyNum; i++) {
            if (copyNum % i == 0) {
                fp += i+",";
                copyNum /= i;
                i--;
            }
        }

        String[] resS = fp.split(",");
        int[] res = new int[resS.length];
        for (int i = 0; i < resS.length; i++) {
            res[i] = Integer.parseInt(resS[i]);
        }
        return res;
    }
}
