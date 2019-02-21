package cenfotec.katas.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumCalculator {
    public static int add(String number) throws InvalidNumberSeparatorException {
        int sum = 0;
        String nums[] = number.split(",|;");
        Pattern pattern = Pattern.compile("[0-9]*;?,?");
        Matcher matcher = pattern.matcher(number);
        try {
            if (matcher.find()) {
                for (String num : nums) {
                    sum += Integer.parseInt(num);
                }
            }
        } catch (Exception e) {
            throw new InvalidNumberSeparatorException("Available separators: , or ;");
        }
        return sum;
    }
}
