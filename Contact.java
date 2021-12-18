/**
 * Author: Jacob Valdiviez
 * Date: 11/11/21
 */

import java.util.UUID;

public class Contact {

    //Contact ID
    private String contactID;
    //First Name
    private String firstName;
    //Last Name
    private String lastName = "";
    //Phone number
    private String phone = "";
    //Address
    private String address = "";

    /**
     * Default constructor
     * Sets every field to default
     */
    public Contact(){

        //Assigns a unique id with 10 characters
        this.contactID = UUID.randomUUID().toString().substring(0,10);
        this.firstName = "";
        this.lastName = "";
        this.phone = "";
        this.address = "";

    }

    /**
     * Constructor with details
     * @param firstName
     * @param lastName
     * @param phone
     * @param address
     */
    public Contact(String firstName, String lastName, String phone, String address){

        this.contactID = UUID.randomUUID().toString().substring(0,10);
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);

    }

    /**
     * Sets first name with a limit of 10 characters
     * @param firstName
     */
    public void setFirstName(String firstName){

        this.firstName = (firstName.length() > 10) ? firstName.substring(0,10) : firstName;

    }

    /**
     * Sets last name with a limit of 10 characters
     * @param lastName
     */
    public void setLastName(String lastName){

        this.lastName = (lastName.length() > 10) ? lastName.substring(0,10) : lastName;

    }

    /**
     * Sets phone number with exactly 10 digits
     * Empty if 10 digits weren't provided
     * @param phone
     */
    public void setPhone(String phone){

        this.phone = (phone.length() != 10) ? "" : phone;

    }

    /**
     * Sets address with a limit of 30 characters
     * @param address
     */
    public void setAddress(String address) {

        this.address = (address.length() > 30) ? address.substring(0,10) : address;

    }

    /**
     * Getter for contact ID
     * @return contact ID
     */
    public String getContactID(){return this.contactID;}

    /**
     * Getter for first name
     * @return first name
     */
    public String getFirstName(){return this.firstName;}

    /**
     * Getter for last name
     * @return last name
     */
    public String getLastName(){return this.lastName;}

    /**
     * Getter for phone number
     * @return phone number
     */
    public String getPhone(){return this.phone;}

    /**
     * Getter for address
     * @return address
     */
    public String getAddress(){return this.address;}
}
