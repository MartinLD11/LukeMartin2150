package Movie;

/**
 * class: Movie
 * this Movie type class has four attributes
 * attribute/data part
 * title of a movie
 * released year
 * name of a director
 * name of the leading role actor or actress.
 *
 * constructors
 * (1) no-arg constructors with default value you want to assign but you must
 * apply a constructor with all attributes as parameters.
 * (2)constructor takes all attributes
 *
 * methods
 * getters, setters, toString
 * toString method should display information about the movie in a nice format.
 *
 * grade 
 */
public class Movie {
    private String title;
    private int year;
    private String director;
    private String role;

    public Movie(){
        this("Jaws", 1975, "Steven Speilberg", "Roy Scheider");
    }
    public Movie(String title, int year, String director, String role){
        this.title = title;
        this.year = year;
        this.director = director;
        this.role = role;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void writeOutput(){
        System.out.println("Title: " + title);
        System.out.println("Year of Release: " + year);
        System.out.println("Director of Movie: " + director);
        System.out.printf("Main Actor or Actress of Movie: " + role);
    }
    @Override
    public String toString(){
        return "Title: " + title + "\n" + "Year: " + year + "\n" +  "Director: " + director + "\n" + "Actor/Actress: " + role;
    }
}
