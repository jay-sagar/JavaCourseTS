package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// it is used to store key value pair, the default size of hashmap is 16
// map is a interface and hashmap, linkedhashmap, treemap are the implementing class of map
// key should be unique, no duplicate key are allowed
// one null key is allowed
// multiple null values and duplicate value are allowed
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "323");
        map.put(102, "323");
        map.put(103, "323");
        map.put(104, "323");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println();

        printEvenKey();

        System.out.println();

        printFrequencyOfInda();
    }

    // WAP to print the values of even key
    public static void printEvenKey() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "323");
        map.put(102, "323");
        map.put(103, "323");
        map.put(104, "323");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            if (entry.getKey() % 2 == 0) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }

    // Wap to print the word frequency of given string INDIA
    public static void printFrequencyOfInda() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "INDIA");
        map.put(102, "323");
        map.put(103, "INDIA");
        map.put(104, "323");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        int frequency = 0;
        for (Map.Entry<Integer, String> entry : entries) {

            if (entry.getValue().equals("INDIA")) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
