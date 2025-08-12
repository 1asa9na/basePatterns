import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        ImageController imageCtl = new ImageController(
            new ImageRepository(new HashMap<>()),
            new ImageView()
        );

        imageCtl.addImage(0, Image.BIRD);
        imageCtl.removeImage(0);
    }
}
