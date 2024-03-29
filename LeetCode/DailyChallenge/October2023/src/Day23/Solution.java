package Day23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        // words:  a       b       ba       bca       bda       bdca
        //   map: {a, 1}, {b, 1}, {ba, 2}, {bca, 3}, {bda, 3}, {bdca, 4}
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (String word : words) {
            int longestSubstring = 0;

            // For each word we remove 1 letter from it and check if we have the result as different word in words
            // If we do -> we increment its counter
            for (int i = 0; i < word.length(); i++) {
                String subWord = word.substring(0, i) + word.substring(i + 1);
                longestSubstring = Math.max(longestSubstring, map.getOrDefault(subWord, 0) + 1);
            }
            map.put(word, longestSubstring);
            max = Math.max(max, longestSubstring);
        }
        return max;
    }
}
