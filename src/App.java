import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Icon addIcon = new AddIcon("Add");
        Icon removeIcon = new RemoveIcon("Remove");
        Icon markIcon = new MarkIcon("Mark");

        AssetController assetController = new AssetController();
        assetController.addAsset(0, markIcon);
        assetController.addAsset(1, addIcon);
        assetController.addAsset(2, removeIcon);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "123-456-7890"));
        contacts.add(new Contact("Jane Smith", "987-654-3210"));
        contacts.add(new Contact("Alice Johnson", "555-555-5555"));
        contacts.add(new Contact("Bob Brown", "444-444-4444"));

        ContactList contactList = new ContactList(contacts, assetController);

        contactList.displayContacts();
    }
}
