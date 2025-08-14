public class App {
    public static void main(String[] args) throws Exception {
        Channel channel = new Channel();
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");

        channel.addObserver(alice);
        channel.addObserver(bob);

        channel.addVideo("Design Patterns in Java");
        channel.addPost("Understanding the Observer Pattern");
    }
}
