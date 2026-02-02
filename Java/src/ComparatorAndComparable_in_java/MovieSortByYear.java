package ComparatorAndComparable_in_java;

import java.util.Comparator;

public class MovieSortByYear implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.year,o2.year);
    }
}
