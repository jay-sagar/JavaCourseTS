package Strings;

import java.util.*;

public class SortMoviesByDateAndRating implements Comparable<SortMoviesByDateAndRating>{
    String name;
    int releaseDate;
    int rating;

    public SortMoviesByDateAndRating (String name, int releaseDate, int rating) {
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.name = name;
    }

    @Override
    public int compareTo(SortMoviesByDateAndRating other) {
        return this.rating - other.rating;
    }

    @Override
    public String toString() {
        return "Movie name: " + name + ", Release Date: " + releaseDate + ", Rating: " + rating;
    }

    public static void main(String[] args) {
        List<SortMoviesByDateAndRating> movie = Arrays.asList(
                new SortMoviesByDateAndRating("Harry Potter", 150212, 4),
                new SortMoviesByDateAndRating("Attack On Titan", 200320, 5),
                new SortMoviesByDateAndRating("Inception", 320519, 2)
        );

        Collections.sort(movie);
        System.out.println(movie);
    }
}
