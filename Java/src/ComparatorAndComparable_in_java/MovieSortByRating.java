package ComparatorAndComparable_in_java;

import java.util.Comparator;

public class MovieSortByRating implements Comparator<Movie> {

// Sort Based On Rating
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.rating,m2.rating);
    }
}
