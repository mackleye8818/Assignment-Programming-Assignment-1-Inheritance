public class Song extends RetailItem {
    private String artist;
    private int length;
    public Song(String name, String artist, int length) {
        super(name);
        this.artist = artist;
        this.length = length;
    }
    public Song(String name, int stars, String artist, int length) {
        super(name, stars);
        this.artist = artist;
        this.length = length;
    }
    public String getArtist() {
        return artist;
    }
    public int getLength() {
        return length;
    }    @Override
    public String toString() {
        int minutes = length / 60;
        int seconds = length % 60;
        return "Song Name: " + getName() + ", Stars: " + getStars() +
               "\nArtist: " + artist + ", Length: " + minutes + ":" + String.format("%02d", seconds);
    }
}
