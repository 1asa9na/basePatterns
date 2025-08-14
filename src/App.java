public class App {
    public static void main(String[] args) throws Exception {
        TemplateDatabase db = new DatabaseReal("path/to/database");
        db.manipulateData();
    }
}
