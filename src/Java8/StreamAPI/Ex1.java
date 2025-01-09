package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 2, 9);
        list.stream().forEach(System.out::print);
        System.out.println();

        List<Integer> evens = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(evens);
        long odds = list.stream().filter(x -> x % 2 != 0).count();
        System.out.println(odds);

        list.stream().map(x -> x * x).sorted((a, b) -> a - b).forEach(System.out :: print);

        System.out.println();

        List<String> l2 = Arrays.asList("12", "32", "44", "32");

        l2.stream().map(x -> Integer.parseInt(x)).forEach(System.out :: print);

        List<String> l3 = Arrays.asList("India", "Japan", "USA", "UK", "China", "Russia", "AUS");

        l3.stream().filter( x -> x.length() <= 3).forEach(Ex1 :: display);

        Ex1 ex1 = new Ex1();

        l3.stream().filter( x -> x.length() <= 3).forEach(ex1 :: display2);
    }

    public static void display(String name) {
        System.out.print(name + " ");
    }

    public void display2(String name) {
        System.out.println(name);
    }

}
