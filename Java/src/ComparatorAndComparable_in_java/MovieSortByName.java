package ComparatorAndComparable_in_java;

import java.util.Comparator;

public class MovieSortByName implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);        // important is when we sort string then we will use compareTo
    }
}
