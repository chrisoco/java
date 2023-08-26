public class FootballPlayer extends Player {


    public FootballPlayer(String name, int rating) {
        super(name, rating, ConsoleColor.RED);
    }

    @Override
    public void sayHello() {
        super.sayHello("Hello, I am a FootballPlayer & my score is: ");
    }
}
