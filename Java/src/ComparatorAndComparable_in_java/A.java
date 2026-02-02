package ComparatorAndComparable_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Dark Knight", 9.0, 2008));

        //Sorting Using Comparator
     //  Collections.sort(movies, new MovieSortByYear());  // only change here based on your requirement that is sort by Rating,Year,Name

        // Sorting using Comparable You have to write only this
        Collections.sort(movies);

        // Showing Output for both
        for (Movie m : movies) {
            System.out.println(m);   //  Shows All
            System.out.println(m.name + " " + m.rating);  // shows only name and rating
        }

    }
}
