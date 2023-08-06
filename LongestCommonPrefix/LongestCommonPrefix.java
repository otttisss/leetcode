package LongestCommonPrefix;

//Write a function to find the longest common prefix string amongst an array of strings.
//        If there is no common prefix, return an empty string "".


public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];

        if (strs.length == 0 || strs == null)
            return "";

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(commonPrefix)) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);

                if (commonPrefix.isEmpty())
                    return "";
            }
        }
        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        String[] strs3 = {"run", "runnable", "runrunrun"};

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }
}
