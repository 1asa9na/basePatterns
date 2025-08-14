import java.util.Queue;

public class SendMessageStrategy implements Strategy {
    private Queue<String> messages;

    public SendMessageStrategy(Queue<String> messages) {
        this.messages = messages;
    }

    @Override
    public void execute() {
        messages.add("[User] Sending a message");
        System.out.println("Message sent.");
    }
    
}
