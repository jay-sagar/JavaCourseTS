package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// wap to remove all duplicate element from list
public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(21);
        list.add(23);
        list.add(40);

        for (Integer no: list) {
            System.out.println(no);
        }

        Iterator<Integer> itr = list.iterator();

        // java.util.ConcurrentModificationException
//        for (Integer no: list) {
//            if (no % 2 != 0) {
//                list.remove(no);
//            }
//        }

        while (itr.hasNext()) {
            Integer no = itr.next();
            if (no % 2 != 0) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
