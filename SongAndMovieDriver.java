import java.util.*;

public class SongAndMovieDriver {
    public static void main(String[] args) {
        ArrayList<RetailItem> items = new ArrayList<>();
        //Songs
        items.add(new Song("Bad Habit", 4, "Steve Lacy", 232));
        items.add(new Song("Break My Soul", 5, "Beyonce", 278));
        items.add(new Song("Spitting Off the Edge of the World", 4, "Yeah, Yeah, Yeahs, Perfume Genius", 257));
        Song asItWas = new Song("As It Was", "Harry Styles", 167);
        asItWas.setStars(5);
        items.add(asItWas);
        //Movies
        items.add(new Movie("Everything Everywhere All at Once", "R", "Adventure, Sci-Fi", 5));
        items.add(new Movie("Top Gun: Maverick", "PG-13", "Action, Adventure", 4));
        items.add(new Movie("Nope", "R", "Horror", 3));
        Movie avatar = new Movie("Avatar: The Way of Water", "PG", "Adventure, Fantasy");
        avatar.setStars(4);
        items.add(avatar);
        Collections.sort(items);
        Collections.reverse(items);
        for (RetailItem item : items) {
            System.out.println(item.toString());
            System.out.println();
        }
    }
}
