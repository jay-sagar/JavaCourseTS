package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
  1. remove duplicate from list

* 2. WAP to print all city name starting with 'p' from given list

  3. Wap to print all country name who length is greater than 3 from given list

  4. Wap to print union of two integer list

  5. WAP to print avg of all number present in the list

  6. WAP to display the city name with the longest string
*
* */

public class HashSetEx {
    public static void main(String[] args) {
        cityNameStartsWithP();

        System.out.println();

        countryLength();

        System.out.println();

        unionIntegerList();

        System.out.println();

        intersectionIntegerList();

        System.out.println();

        leftIntegerList();

        System.out.println();

        avgOfNumbersInList();
    }

    public void removeDuplicate() {
        // Arrays.asList => it will create an unmodifiable list that is read-only list
        // in other words we cannot add or remove from this list
        // unsupported operation action exception
        List<Integer> list = Arrays.asList(12, 13, 42, 32, 12); // read Only
        Set<Integer> set = new java.util.HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);

        System.out.println(set.size());
        System.out.println(set);

        Set<Integer> set2 = new java.util.HashSet<>();
        set2.addAll(list);
        System.out.println(set2);
    }

    public static void cityNameStartsWithP() {
        List<String> cities = Arrays.asList("Pune", "Patna", "Mumbai");

        for (String city: cities) {
            city = city.toLowerCase();
            if (city.startsWith("p")) {
                System.out.println(city);
            }
        }
    }

    public static void countryLength() {
        List<String> countries = Arrays.asList("USA", "Pakistan", "India", "SriLanka", "AUS", "UK");

        for (String country: countries) {
            int size = country.length();
            if (size > 3) {
                System.out.println(country);
            }
        }
    }

    public static void unionIntegerList() {
        List<Integer> list1 = Arrays.asList(13, 32, 12, 23, 44, 54, 30);
        List<Integer> list2 = Arrays.asList(13, 87, 12, 65, 44, 45, 30);
        Set<Integer> list3 = new java.util.HashSet<>();

        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }

    public static void intersectionIntegerList() {
        Set<Integer> set1 = new java.util.HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new java.util.HashSet<>();
        set2.add(3);
        set2.add(2);

        set2.retainAll(set1);
        System.out.println(set2);
    }

    public static void leftIntegerList() {
        Set<Integer> set1 = new java.util.HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new java.util.HashSet<>();
        set2.add(3);
        set2.add(2);

        set2.removeAll(set1);
        System.out.println(set2);
    }

    public static void avgOfNumbersInList() {
        List<Integer> list = Arrays.asList(31, 32, 11, 42, 55);
        Integer sum = 0;

        for (Integer no: list) {
            sum += no;
        }
        System.out.println(sum / list.size());
    }


}
