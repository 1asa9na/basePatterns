import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> inbox = new LinkedList<>();
        Queue<String> outbox = new LinkedList<>();

        Strategy sendMessageStrategy = new SendMessageStrategy(outbox);
        Strategy readMessageStrategy = new ReadMessageStrategy(inbox);

        inbox.add("Hello, User!");
        inbox.add("Your order has been shipped.");

        User user = new User();
        user.setActivity(sendMessageStrategy);
        user.performActivity();

        user.setActivity(readMessageStrategy);
        user.performActivity();

        for (String message : outbox) {
            System.out.println("Outbox message: " + message);
        }

        for (String message : inbox) {
            System.out.println("Inbox message: " + message);
        }
    }
}
