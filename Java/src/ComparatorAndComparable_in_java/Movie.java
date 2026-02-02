package ComparatorAndComparable_in_java;

public class Movie implements Comparable<Movie>  {      // for comparable implements Movie For Comparator remove implements

    String name;
    double rating;
    int year;

    // Generate Constructor
    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Generate Getters
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    // Generate ToString
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }


    @Override
    public int compareTo(Movie o) {
     //   return Integer.compare(this.year,o.year);   // Sort Based On year
       // return CharSequence.compare(this.name,o.name);   //Sort Based On Name
        return Double.compare(this.rating,o.rating);       // Sort Based On Rating
    }
}
