package Lists.MobilePhoneChallege;

import java.util.ArrayList;

public class MobilePhone {
    public static void main(String[] args) {

    }
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) != -1) {
            return false;
        } else return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != -1) {
            return myContacts.remove(oldContact) && myContacts.add(newContact);
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        return findContact(contact) == -1 ? false : myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        } else return -1;
    }

    private int findContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact) || myContacts.get(i).getPhoneNumber().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    public Contact printContacts(String contact) {
        for (Contact myContact : myContacts) {
            if (myContact.getName().equals(contact)) {
                return myContact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(myContacts.indexOf(contact) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
