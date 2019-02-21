package cenfotec.katas.numerosromanos;

public class Converter {

    public static final String[] UNIDAD = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public static final String[] DECENA ={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static final String[] CENTENA ={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC"};
    public static final String[] MIL ={"", "M", "MM"};

    public static String convert(int num) {
        int u = (num%10);
        int d = (num/10)%10;
        int c = (num/100)%10;
        int m = (num/1000);

        if(num >= 1000) {
            return MIL[m] + CENTENA[c] + DECENA[d] + UNIDAD[u];
        }else {
            if(num >= 100) {
                return CENTENA[c] + DECENA[d] + UNIDAD[u];
            }else {
                if(num >= 10) {
                    return DECENA[d] + UNIDAD[u];
                }else {
                    return UNIDAD[u];
                }
            }
        }
    }
}
