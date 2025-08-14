public class DatabaseReal extends TemplateDatabase {
    public DatabaseReal(String sourcePath) {
        super(sourcePath);
    }

    @Override
    public void manipulate() {
        System.out.println("Manipulating data in the real database.");
    }
}
