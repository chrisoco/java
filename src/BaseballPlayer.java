public class BaseballPlayer extends Player {

    public BaseballPlayer(String name, int rating) {
        super(name, rating, ConsoleColor.GREEN);
    }

    // Overloading
    public BaseballPlayer(String name) {
        super(name, (int) (Math.random() * 100) ,ConsoleColor.GREEN);
    }

    @Override
    public void sayHello() {
        super.sayHello("Hello, I am a BaseballPlayer & my score is: ");
    }
}
