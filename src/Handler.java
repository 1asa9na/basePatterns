public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected Handler getNextHandler() {
        return nextHandler;
    }

    public abstract void processRequest(Request request);
}
