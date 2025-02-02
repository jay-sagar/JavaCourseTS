package Java8.Comparator;
import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getRating().compareTo(o2.getRating());
    }
}
