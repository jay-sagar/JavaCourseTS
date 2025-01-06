package Strings;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Problems {
    public static void main(String[] args) {
        String str = "Welcome to India, India is my country, India is great, I love India";
        countPresentWord("India", str);
        countPresentWord2("India", str);
        frequencyOfChar(str);
        System.out.println(anagram("abcd", "dcab"));
        System.out.println(anagramFrequencyMethod("abcd", "dcab"));
        decompress("a2b3c4d5");
        compress("aabbbccccddddd");
    }

    static void countWord(String str) {
        String[] strArr = str.split("\\s+"); // \\s means space and "+"(greedy space) includes multiple space

        System.out.println("Total Words: " + strArr.length);
    }

    static void countWord2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {

            }
        }
    }

    static void countPresentWord(String word, String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, word.length() + i).equals(word)) {
                count++;
            }
        }
        System.out.println("Total word contains: " + count);
    }

    static void countPresentWord2(String word, String str) {
        int count = 0;
        str = str.replaceAll("[a-zA-Z\\s]", "");

        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) count++;
        }
        System.out.println("Total word contains: " + count);
    }

    static void frequencyOfChar(String str) {
        str = str.toLowerCase();

        int[] frequency = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                frequency[ch - 'a']++;
            }
        }

        System.out.println("Print frequencies");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + frequency[i]);
            }
        }
    }

    static boolean anagram(String str1, String str2) {
        char[] newStr1 = str1.toCharArray();
        char[] newStr2 = str2.toCharArray();

        Arrays.sort(newStr1);
        Arrays.sort(newStr2);

        return Arrays.equals(newStr1, newStr2);
    }

    static boolean anagramFrequencyMethod(String str1, String str2) {
        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq[ch - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    static void decompress(String str) {
        String newStr = "";

        int letter = 0;
        int freq = 1;

        while (freq <= str.length()) {
            char word = str.charAt(letter);
            int frequency = str.charAt(freq) - '0';

            for(int i = 1; i <= frequency; i++) {
                newStr += word;
            }
            letter += 2;
            freq += 2;
        }
        System.out.println(newStr);
    }

    static void compress(String str) {
        HashMap<Character, Integer> set = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (set.containsKey(key)) {
                set.put(key, set.get(key) + 1);
            } else {
                set.put(key, 1);
            }
        }
        
        String newStr = "";
        for (Character i : set.keySet()) {
            newStr += Character.toString(i) + set.get(i);
        }

        System.out.println(newStr);
    }
}

/*
1. WAP to check the given string is palindrome string or not
 * 2. WAP to print count of vowels and consonants
 *
         * "Welcome to India, India is my country, India is great, I love India"
         *
         * 3. WAP to print word count present in given string
 * 4. WAP to print the count of given word present in string
 *     "India"
         * 5.WAp to print the frequency of the character present in given string
 * 6. Wap to check the given string is anagram or not
 *
         *       str ="race" and str2 = "care"
        * 7.WAp to check the given string is roational to each other or not
 * 				"java"
         * 			   "vaja"
         * 			"welcome"
         * 			"comewel"
         *
         * 8. WAp to compress the given string and return the compressed string if the size of compressed
 * 		string is larger than original string then return original string
 *
         * 		"aabbdddfff"
         * 		"a2b2d3f3"
         *
         * 		"abcd"
         * 		"a1b1c1d1"
         * 9.WAp to decompreesed the compressed string
 *      "a1b1c1d1"
         "abcd"
 */
