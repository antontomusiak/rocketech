package tech.rocke.task;

public class Solution {

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) return input;
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i-1)) {
                counter++;
            } else {
                result.append(input.charAt(i-1)).append(counter);
                counter = 1;
            }
        }
        result.append(input.charAt(input.length()-1)).append(counter);
        return result.toString();
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
