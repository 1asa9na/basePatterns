import java.util.Map;

public class ImageRepository {
    Map<Integer, Image> imageMap;

    public ImageRepository(Map<Integer, Image> map) {
        this.imageMap = map;
    }

    public void saveImage(Image image, int id) {
        imageMap.put(id, image);
    }

    public Image loadImage(int id) {
        return imageMap.get(id);
    }

    public void deleteImage(int id) {
        imageMap.remove(id);
    }
}
