public class Track extends Record {
    public Track(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.print("Playing track: ");
        printTitle();
    }
}
