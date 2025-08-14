public class Counter {
    private State state;
    private int count;

    public Counter() {
        state = State.ONES;
        count = 0;
    }

    public void handleEvent(Event event) {
        switch (event) {
            case INCREASE_STATE:
                increaseState();
                break;
            case DECREASE_STATE:
                decreaseState();
                break;
        }
    }

    private void increaseState() {
        count += state.getValue();
        if (Math.abs(count) >= 100) {
            state = State.HUNDREDS;
        } else if (Math.abs(count) >= 10) {
            state = State.TENS;
        } else {
            state = State.ONES;
        }
    }

    private void decreaseState() {
        count -= state.getValue();
        if (Math.abs(count) >= 100) {
            state = State.HUNDREDS;
        } else if (Math.abs(count) >= 10) {
            state = State.TENS;
        } else {
            state = State.ONES;
        }
    }

    public int getCount() {
        return count;
    }
}
