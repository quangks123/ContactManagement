
package models;

public class Contact {
    private int id;
    private String name, group, address, phone;

    public Contact(int id, String name, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String[] n = name.split(" ");
        return String.format("%-4s | %-18s | %-10s | %-10s | %-6s | %-15s | %s ", id, name, n[0], n[1], group, address, phone);
    }
    
    
}
