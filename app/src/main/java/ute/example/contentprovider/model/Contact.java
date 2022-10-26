package ute.example.contentprovider.model;

import java.io.Serializable;

public class Contact implements Serializable {
    private String Phone;
    private String Name;

    public Contact(String phone, String name) {
        this.Phone = phone;
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String toString() {
        return "Ten:" + Name +"\nPhone" + getPhone();
    }
}
