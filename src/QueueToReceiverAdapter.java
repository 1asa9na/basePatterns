import java.util.Queue;

public class QueueToReceiverAdapter implements Receiver {

    private Queue<Command> queue;

    public QueueToReceiverAdapter(Queue<Command> queue) {
        this.queue = queue;
    }

    @Override
    public Command receive() {
        return queue.poll();
    }
}
