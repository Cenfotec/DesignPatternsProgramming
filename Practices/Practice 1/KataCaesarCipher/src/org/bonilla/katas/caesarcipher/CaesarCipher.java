package org.bonilla.katas.caesarcipher;

public class CaesarCipher {
    public static String encrypt(String s, int conf) {
        String r = "";
        char[] res = new char[s.length()];
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            for (int j = 0; j < conf; j++) {
                cs[i] += 1;
                char toSet = ((cs[i]) == ('Z'+1)) ? cs[i] = 'A' : (cs[i]);
                res[i] = toSet;
            }
            r += res[i];
        }
        return r;
    }
}
