public class Movie extends RetailItem {
    private String rating;
    private String genre;
    public Movie(String name, String rating, String genre) {
        super(name);
        this.rating = rating;
        this.genre = genre;
    }
    public Movie(String name, String rating, String genre, int stars) {
        super(name, stars);
        this.rating = rating;
        this.genre = genre;
    }
    public String getRating() {
        return rating;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public String toString() {
        return "Movie Name: " + getName() + ", Stars: " + getStars() +
               "\nRating: " + rating + ", Genre: " + genre;
    }
}
