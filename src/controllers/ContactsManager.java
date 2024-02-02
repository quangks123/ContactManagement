
package controllers;

import java.util.ArrayList;
import models.Contact;

public class ContactsManager {
    private ArrayList<Contact> c = new ArrayList<>();
    
    private int id = c.size();
    
    public void addContact(String name, String group, String address, String phone) {
        id++;
        c.add(new Contact(id, name, group, address, phone));
    }
    
    public void printContacts() {
        System.out.println(String.format("%-4s | %-18s | %-10s | %-10s | %-6s | %-15s | %s ", "ID", "Name", "First Name","Last Name", "group", "address", "phone"));
        for (Contact contact : c) {
            System.out.println(contact);
        }
    }
    
    public void deleteContact(int id) {
        for (int i = 0; i < c.size(); i++) {
            if (id == c.get(i).getId()) {
                c.remove(i);
                return;
            }
        }
        System.out.println("NOT FOUND");
    }
    
    
    
}
