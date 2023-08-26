public class BaseballPlayer extends Player {

    public BaseballPlayer(String name, int rating) {
        super(name, rating, ConsoleColor.GREEN);
    }

    @Override
    public void sayHello() {
        super.sayHello("Hello, I am a BaseballPlayer & my score is: ");
    }
}
