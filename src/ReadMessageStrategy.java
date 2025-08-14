import java.util.Queue;

public class ReadMessageStrategy implements Strategy {
    private Queue<String> messages;

    public ReadMessageStrategy(Queue<String> messages) {
        this.messages = messages;
    }

    @Override
    public void execute() {
        if (!messages.isEmpty()) {
            String message = messages.poll();
            System.out.println("Reading message: " + message);
        } else {
            System.out.println("No messages to read.");
        }
    }
    
}
