
package views;

import controllers.ContactsManager;
import controllers.Validation;

public class User extends Menu{
    
    Validation val = new Validation();
    ContactsManager c = new ContactsManager();
    
    public User(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("=== ADD NEW ===");
                String name, address, group, phone;
                while (true) {                    
                    System.out.print("Enter name: ");
                    name = val.inputString();
                    String[] n = name.split(" ");
                    if (n.length == 2) {
                        break;
                    } else {
                        System.out.println("Wrong format");
                    }
                }
                
                System.out.print("Enter address: ");
                address = val.inputString();
                System.out.print("Enter group: ");
                group = val.inputString();
                while (true) {                    
                    System.out.print("Enter phone: ");
                    phone = val.inputString();
                    if (!val.checkPhone(phone.trim())) {
                        System.out.print("Wrong format!!");
                    } else {
                        break;
                    }
                }
                
                
                c.addContact(name, group, address, phone);
                System.out.println("SUCCESS!");
                break;
            case 3:
                System.out.println("===DELETE CONTACT===");
                int id;
                while (true) {
                    System.out.print("Enter ID: ");
                    id = val.inputNum();
                    if (id < 1) {
                        System.out.println("ID > 0");
                    } else {
                        break;
                    }
                }
                
                c.deleteContact(id);
                break;
                
            case 2:
                System.out.println("===DISPLAY ALL===");
                c.printContacts();
                break;
        }
    }
    
}
