import java.util.List;

public class ContactList {
    AssetController assetController;
    List<Contact> contacts;

    public ContactList(List<Contact>contacts, AssetController assetController) {
        this.contacts = contacts;
        this.assetController = assetController;
    }

    private String center(String text, int width) {
        int padding = width - text.length();
        if (padding > 0) {
            int padLeft = padding / 2;
            int padRight = padding - padLeft;
            return " ".repeat(padLeft) + text + " ".repeat(padRight);
        }
        return text;
    }

    public void displayContacts() {
        int max = 25;
        System.out.println("+" + "-".repeat(max + 2) + "+");
        System.out.println("| " + center("Contacts", max) + " |");
        System.out.println("+" + "-".repeat(max + 2) + "+");
        for (Contact contact: contacts) {
            String contactName = "Contact: " + contact.getName();
            String contactPhone = "Phone: " + contact.getPhoneNumber();
            if (contactName.length() > max) {
                contactName = contactName.substring(0, max - 3) + "...";
            }
            if (contactPhone.length() > max) {
                contactPhone = contactPhone.substring(0, max - 3) + "...";
            }
            System.out.println("| " + center(contactName, max) + " |");
            System.out.println("| " + center("Phone: " + contact.getPhoneNumber(), max) + " |");
            for(int j = 0; j < 3; j++) {
                System.out.print("|");
                assetController.getAssetById(j).display();
            }
            System.out.println("|");
            System.out.println("+" + "-".repeat(max + 2) + "+");
        }
    }
}
