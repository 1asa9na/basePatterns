public class App {
    public static void main(String[] args) throws Exception {
        Playlist playlist = new Playlist(new String[]{"Song 1", "Song 2", "Song 3"});
        Iterator<String> iterator = playlist.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
