public enum State {
    ONES(1),
    TENS(10),
    HUNDREDS(100);

    private final int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
