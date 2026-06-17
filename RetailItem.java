public class RetailItem implements Comparable<RetailItem> {
    private String name;
    private int stars;
    public RetailItem(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }
    public RetailItem(String name) {
        this(name, 0);
    }
    public String getName() {
        return name;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public int getStars() {
        return stars;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Stars: " + stars;
    }
    @Override
    public int compareTo(RetailItem other) {
        return Integer.compare(this.stars, other.stars);
    }
}
