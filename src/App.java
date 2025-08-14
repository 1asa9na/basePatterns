public class App {
    public static void main(String[] args) throws Exception {
        History history = new History();
        Document document = new Document("Initial content");
        history.addState(document.save());
        Thread.sleep(1000);
        document.setContent("Updated content");
        history.addState(document.save());

        Iterator<DocumentSaver> iterator = history.getIterator();
        
        while (iterator.hasNext()) {
            document.load(iterator.next());
            System.out.println("Current State: " + document.getContent());
        }

        while (iterator.hasPrevious()) {
            document.load(iterator.previous());
            System.out.println("Previous State: " + document.getContent());
        }
    }
}
