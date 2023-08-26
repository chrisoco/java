public abstract class Player implements CanSayHello{

    private String name;
    private int rating;
    private ConsoleColor color;

    public Player(String name, int rating, ConsoleColor color) {
        this.name   = name;
        this.rating = rating;
        this.color  = color;
    }

    public void sayHello(String message) {
        System.out.println(this.color.getCode() + message + this.rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ConsoleColor getColor() {
        return color;
    }

    public void setColor(ConsoleColor color) {
        this.color = color;
    }
}
