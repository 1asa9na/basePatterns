import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Command> queue = new ConcurrentLinkedQueue<Command>();
        Sender sender = new QueueToSenderAdapter(queue);
        Receiver receiver = new QueueToReceiverAdapter(queue);

        sender.send(new PrintCommand("Hello, World!"));

        receiver.receive().run();
    }
}
