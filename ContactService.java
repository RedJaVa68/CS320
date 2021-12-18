import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {

    ArrayList<Contact> contacts = new ArrayList<>();

    /**
     * Lists the contacts
     */
    public void listContacts(){

        System.out.println("=============Contacts============");
        //Traverse through contacts
        for(Contact contact : contacts){

            //Prints contact
            printContact(contact);
            System.out.println();

        }


    }

    /**
     * Prints a contact
     * @param contact
     */
    public void printContact(Contact contact){

        //Unique id
        System.out.println("\tID: " + contact.getContactID());
        //First name and last name
        System.out.println("\t" + contact.getFirstName() + ", " + contact.getLastName());
        //Phone number
        System.out.println("\tPhone: " + contact.getPhone());
        //Address
        System.out.println("\tAddress: " + contact.getAddress());

    }

    /**
     * Adds Contact
     * @param firstName
     * @param lastName
     * @param phone
     * @param address
     */
    public void addContact(String firstName, String lastName, String phone, String address){


        contacts.add(new Contact(firstName, lastName, phone, address));


    }

    /**
     * Deletes contact by id
     * @param contactID
     */
    public void deleteContact(String contactID){

        //Finds contact to delete
        for(int i = 0; i < contacts.size(); i ++) {

            if (contacts.get(i).getContactID().equalsIgnoreCase(contactID)) {

                //Removes contact
                contacts.remove(i);
                break;

            }

        }

    }

    /**
     * Edits contact by id
     * 1 means edit first name
     * 2 means edit last name
     * 3 means edit phone number
     * 4 means edit address
     * @param contactID
     * @param type
     * @param edit
     */
    public void editContact(String contactID, int type, String edit){

        Contact contact = new Contact();

        //Looks for contact
        for(int i = 0; i < contacts.size(); i ++){

            if(contacts.get(i).getContactID().equalsIgnoreCase(contactID)){

                //Found contact to edit
                contact = contacts.get(i);
                break;

            }

        }

        //Switches answer
        switch (type){

            //Edits first name
            case 1:
                contact.setFirstName(edit);
                break;
            //Edits last name
            case 2:
                contact.setLastName(edit);
                break;
            //Edits phone number
            case 3:
                contact.setPhone(edit);
                break;
            //Edits address
            case 4:
                contact.setAddress(edit);
                break;
            default:
                break;

        }

    }

}
