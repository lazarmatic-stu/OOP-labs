package org.example.exercise.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String email;
    private String phone;
    public Contact(String name, String email, String phone) throws InvalidContact{
        if(name == null || name.isEmpty()){throw new InvalidContact("Your name is empty");}
        if(email == null || !email.contains("@") || !email.contains(".")){throw new InvalidContact("Email is not correct");}
        if(phone == null || phone.length() != 10 || !phone.matches("\\d+")){throw new InvalidContact("Your phone not correct");}
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString(){
        return name + "," + email + "," + phone;
    }
    public static Contact fromString(String data) throws InvalidContact{
        String[] parts = data.split(",");
        if (parts.length != 3){throw new InvalidContact("Invalid contact");
        } return new Contact(parts[0] , parts[1] , parts[2]);
    }
}

class ContactManager{
    private String fileName;
    public ContactManager(String fileName){
        this.fileName = fileName;
    }
    public void addContact(Contact contact) throws IOException , InvalidContact {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName , true));
        writer.write(contact.toString());
        writer.newLine();
        writer.close();
    }
    public List<Contact> contactList() throws IOException{
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));){
        String line;
            while ((line = reader.readLine()) != null) {
                contacts.add(Contact.fromString(line));
            }
        }
        return contacts;
    }
}

class Main{
    public static void main(String[] args){
        Contact contact1 = new Contact("Lazar" , "asdadsa@." , "1234567891");
        Contact contact2 = new Contact("Lazarr" , "lolololo@." , "1234567891");
        System.out.println(contact1.toString());
        ContactManager manager1 = new ContactManager("contacts2.txt");
        try {
        manager1.addContact(contact2);
        manager1.addContact(contact1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
