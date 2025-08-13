public class App {
    public static void main(String[] args) throws Exception {
        Handler ph = new PhotoHandler();
        Handler vh = new VideoHandler();
        Handler ah = new AudioHandler();

        Request request = new Request(Flag.VIDEO);
        ph.setNextHandler(vh);
        vh.setNextHandler(ah);
        ph.processRequest(request);
    }
}
