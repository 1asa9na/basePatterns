public class ImageController {
    ImageRepository imageRepository;
    ImageView imageView;

    public ImageController(ImageRepository imageRepository, ImageView imageView) {
        this.imageRepository = imageRepository;
        this.imageView = imageView;
    }

    public void addImage(int id, Image image) {
        imageRepository.saveImage(image, id);
        imageView.displayImage(image);
    }

    public void removeImage(int id) {
        Image image = imageRepository.loadImage(id);
        if (image != null) {
            imageRepository.deleteImage(id);
            imageView.hideImage(image);
        }
    }
}
