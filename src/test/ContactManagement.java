
package test;

import views.User;

public class ContactManagement {
    public static void main(String[] args) {
        String[] choices = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
        new User("========= Contact program =========", choices).run();
    }
}
