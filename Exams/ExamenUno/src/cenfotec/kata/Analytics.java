package cenfotec.kata;

import java.util.ArrayList;
import java.util.Collections;

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
        Collections.sort(arrList);
        String[] allMax = (String[]) arrList.stream().toArray(String[]::new);
        return allMax;
    }

    public static String[] masCorta(String[] arr) {
        ArrayList arrList = new ArrayList();
        int maxSize = arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < maxSize) {
                maxSize = arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxSize) {
                arrList.add(arr[i]);
            }
        }
        Collections.sort(arrList);
        String[] allMax = (String[]) arrList.stream().toArray(String[]::new);
        return allMax;
    }

    public static String[] primeraMasLarga(String[] arr) {
        String[] allNum = new String[1];
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxSize) {
                maxSize = arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxSize) {
                allNum[0] = arr[i];
                break;
            }
        }
        return allNum;
    }
}
