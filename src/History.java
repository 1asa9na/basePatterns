import java.util.ArrayList;

public class History extends Iterable<DocumentSaver> {
    public History() {
        super(new ArrayList<>());
    }

    public void addState(DocumentSaver state) {
        items.add(state);
    }

    public Iterator<DocumentSaver> getIterator() {
        return iterator();
    }
}
