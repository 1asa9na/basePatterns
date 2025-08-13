public class VideoHandler extends Handler {
    @Override
    public void processRequest(Request request) {
        if (request.getFlag() == Flag.VIDEO) {
            System.out.println("Processing video request");
        }
        if (getNextHandler() != null) {
            getNextHandler().processRequest(request);
        }
    }
}
