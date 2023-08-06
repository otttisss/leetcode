package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNum = new HashMap<>();

        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int totalNum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanNum.get(c);

            if (value < prev) {
                totalNum = totalNum - value;
            } else {
                totalNum = totalNum + value;
            }
            prev = value;
        }

        return totalNum;
    }

    public static void main(String[] args) {
        String str1 = "III";
        String str2 = "IV";
        String str3 = "LVIII";
        String str4 = "MCMXCIV";

        int total1 = romanToInt(str1);
        int total2 = romanToInt(str2);
        int total3 = romanToInt(str3);
        int total4 = romanToInt(str4);

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
    }
}
