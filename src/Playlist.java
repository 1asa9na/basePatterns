import java.util.ArrayList;
import java.util.List;

public class Playlist extends Record {
    private List<Playable> items;

    public Playlist(String title) {
        super(title);
        this.items = new ArrayList<>();
    }

    public void add(Playable item) {
        items.add(item);
    }

    @Override
    public void play() {
        System.out.print("Playing playlist: ");
        printTitle();
        for (Playable item : items) {
            System.out.print(" - ");
            item.play();
        }
    }
    
}
