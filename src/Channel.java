import java.util.ArrayList;
import java.util.List;

public class Channel implements Observed {
    private List<Observer> observers = new ArrayList<>();
    private String lastVideo;
    private String lastPost;

    public void addVideo(String video) {
        lastVideo = video;
        notifyObservers();
    }

    public void addPost(String post) {
        lastPost = post;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("New content created!\nLast video: " + lastVideo + "\nLast post: " + lastPost);
        }
    }

}
