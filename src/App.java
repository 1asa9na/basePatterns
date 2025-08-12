public class App {
    public static void main(String[] args) throws Exception {
        Track track1 = new Track("Track 1");
        Track track2 = new Track("Track 2");

        Playlist playlist = new Playlist("My Playlist");
        playlist.add(track1);
        playlist.add(track2);

        playlist.play();
    }
}
