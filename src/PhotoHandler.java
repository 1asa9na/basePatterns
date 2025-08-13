public class PhotoHandler extends Handler {
    @Override
    public void processRequest(Request request) {
        if (request.getFlag() == Flag.PHOTO) {
            System.out.println("Processing photo request");
        }
        if (getNextHandler() != null) {
            getNextHandler().processRequest(request);
        }
    }
}
