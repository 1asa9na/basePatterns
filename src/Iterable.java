import java.util.List;

public class Iterable<T> {
    protected final List<T> items;

    public Iterable(List<T> items) {
        this.items = items;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < items.size();
            }

            @Override
            public T next() {
                return items.get(index++);
            }

            @Override
            public boolean hasPrevious() {
                return index > 0;
            }

            @Override
            public T previous() {
                return items.get(--index);
            }
        };
    }
}