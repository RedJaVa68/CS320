import org.junit.Test;

import static org.junit.Assert.*;

public class ContactServiceTest {

    /**
     * Tests adding contacts
     */
    @Test
    public void addContact() {

        ContactService service = new ContactService();

        //Run the add contact method
        service.addContact("Rob", "Silva","9155551010","123 address");

        //Check if the size increased to 1
        assertEquals(service.contacts.size(),1);

        //Check if the first name is correct
        assertEquals("Rob", service.contacts.get(0).getFirstName());

        //Check if the last name is correct
        assertEquals("Silva", service.contacts.get(0).getLastName());

        //Check if the phone is correct
        assertEquals("9155551010",service.contacts.get(0).getPhone());

        //Check if the address is correct
        assertEquals("123 address", service.contacts.get(0).getAddress());

    }

    /**
     * Tests delete contact
     */
    @Test
    public void deleteContact() {

        ContactService service = new ContactService();

        //Adds a contact to be deleted
        service.contacts.add(new Contact("Rob", "Silva", "9155551010","123 address"));

        //Runs the delete contact method
        service.deleteContact(service.contacts.get(0).getContactID());

        //Checks if the contact is deleted
        assertEquals(service.contacts.size(),0);

    }

    /**
     * Tests the edit contact method
     */
    @Test
    public void editContact() {

        ContactService service = new ContactService();

        //Adds a contact to be tested
        service.contacts.add(new Contact("Rob", "Silva", "9155551010", "123 address"));

        //Runs the edit contact method to edit first name
        service.editContact(service.contacts.get(0).getContactID(),1,"Bob");

        //Checks if first name is correct
        assertEquals("Bob",service.contacts.get(0).getFirstName());

        //Runs the edit contact method to edit last name
        service.editContact(service.contacts.get(0).getContactID(),2, "Saenz");

        //Checks if last name is correct
        assertEquals("Saenz",service.contacts.get(0).getLastName());

        //Runs the edit contact method to edit phone
        service.editContact(service.contacts.get(0).getContactID(),3,"9154441010");

        //Checks if the phone is correct
        assertEquals("9154441010", service.contacts.get(0).getPhone());

        //Runs the edit contact method to edit address
        service.editContact(service.contacts.get(0).getContactID(),4,"123 lane");

        //Checks if the address is correct
        assertEquals("123 lane",service.contacts.get(0).getAddress());

    }
}