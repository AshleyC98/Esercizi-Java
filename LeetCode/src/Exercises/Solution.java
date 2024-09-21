package Exercises;
/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end
of the merged string.
Return the merged string.*/
public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        if (word1.isEmpty()) return word2;
        if (word2.isEmpty()) return word1;
        StringBuilder output = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            output.append(word1.charAt(i++));
            output.append(word2.charAt(j++));
        }
        if (i < word1.length()) {
            output.append(word1.substring(i));
        }
        if (j < word2.length()) {
            output.append(word2.substring(j));
        }
        return output.toString();

    }
}
