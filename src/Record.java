public abstract class Record implements Playable {
    String title;

    public Record(String title) {
        this.title = title;
    }

    public void printTitle() {
        System.out.println(title);
    }
}
