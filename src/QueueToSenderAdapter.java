import java.util.Queue;

public class QueueToSenderAdapter implements Sender {

    private Queue<Command> queue;

    public QueueToSenderAdapter(Queue<Command> queue) {
        this.queue = queue;
    }

    @Override
    public void send(Command command) {
        queue.offer(command);
    }
}
