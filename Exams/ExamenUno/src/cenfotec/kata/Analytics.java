package cenfotec.kata;

import java.util.ArrayList;

public class Analytics {

    public static String[] masLarga(String[] arr) {
        ArrayList arrList = new ArrayList();
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxSize) {
                maxSize = arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxSize) {
                arrList.add(arr[i]);
            }
        }
        String[] allMax = (String[]) arrList.stream().toArray(String[]::new);
        return allMax;
    }
}