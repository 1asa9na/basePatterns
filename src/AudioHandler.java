public class AudioHandler extends Handler {
    @Override
    public void processRequest(Request request) {
        if (request.getFlag() == Flag.AUDIO) {
            System.out.println("Processing audio request");
        }
        if (getNextHandler() != null) {
            getNextHandler().processRequest(request);
        }
    }
}
