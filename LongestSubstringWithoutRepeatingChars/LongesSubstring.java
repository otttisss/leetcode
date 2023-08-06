package LongestSubstringWithoutRepeatingChars;

//Given a string s, find the length of the longest
//        substring
//        without repeating characters.

import java.util.HashMap;
import java.util.Map;

public class LongesSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int start = 0;
        Map<Character, Integer> charsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (charsMap.containsKey(c)) {
                start = Math.max(start, charsMap.get(c) + 1);
            }
            charsMap.put(c, i);
            length = Math.max(length, i - start + 1);
        }

        return length;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
