public abstract class TemplateDatabase {
    private String sourcePath;

    public TemplateDatabase(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public void manipulateData() {
        System.out.println("Reading data from: " + sourcePath);
        manipulate();
        System.out.println("Writing data to: " + sourcePath);
    }

    public abstract void manipulate();
}
