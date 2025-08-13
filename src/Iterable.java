public class Iterable<T> {
    protected final T[] items;

    public Iterable(T[] items) {
        this.items = items;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < items.length;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }   
}
