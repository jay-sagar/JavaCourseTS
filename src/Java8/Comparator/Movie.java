package Java8.Comparator;

public class Movie {
    String name;
    Integer releaseDate;
    Double rating;
    Double totalEarning;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for releaseDate
    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    // Getter and Setter for rating
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    // Getter and Setter for totalEarning
    public Double getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(Double totalEarning) {
        this.totalEarning = totalEarning;
    }

    Movie(String name, Integer releaseDate, Double rating, Double totalEarning) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.totalEarning = totalEarning;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                ", totalEarning=" + totalEarning +
                '}';
    }
}