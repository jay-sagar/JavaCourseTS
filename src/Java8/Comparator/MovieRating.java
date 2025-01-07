package Java8.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieRating {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        Movie m1 = new Movie("The Shawshank Redemption", 1994, 4.0, 10000.0);
        Movie m2 = new Movie("The Godfather", 2001, 2.0, 10000.0);
        Movie m3 = new Movie("The Dark Knight", 2005, 8.0, 10000.0);
        Movie m4 = new Movie("The Godfather Part II", 2008, 4.0, 10000.0);

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

//        Collections.sort(list, new RatingComparator());
        Collections.sort(list, new ReleaseDateComparator());

        System.out.println(list.toString());
    }
}
