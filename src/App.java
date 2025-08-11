public class App {
    public static void main(String[] args) throws Exception {
        HR hr = new HR(new JavaMidDeveloperBuilder());
        Developer developer = hr.buildDeveloper();
        developer.printDetails();
    }
}
