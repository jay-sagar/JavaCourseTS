package Assigment;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str: arr) {
            char[] sortedArr = str.toCharArray();
            Arrays.sort(sortedArr);
            String sortedKey = new String(sortedArr);

            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        System.out.println(map.values());
    }
}
