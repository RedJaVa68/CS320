import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    /**
     * Tests first name
     */
    @Test
    public void setFirstName() {

        Contact test = new Contact();
        test.setFirstName("Rocky");
        //Checks if first name is correct
        assertEquals("Rocky", test.getFirstName());

        test.setFirstName("Namelongerthan10");

        //Checks if name is correct length
        assertTrue(test.getFirstName().length() <= 10);

    }

    /**
     * Tests last name
     */
    @Test
    public void setLastName() {

        Contact test = new Contact();
        test.setLastName("Hopps");
        //checks if last name is correct
        assertEquals("Hopps", test.getLastName());

        test.setLastName("Namelongerthan10");

        //Checks if name is correct length
        assertTrue(test.getLastName().length() <= 10);

    }

    /**
     * Tests phone number
     */
    @Test
    public void setPhone() {

        Contact test = new Contact();
        test.setPhone("9154501010");
        //Checks if phone is correct
        assertEquals("9154501010", test.getPhone());

        test.setPhone("00000000000000000000000000");

        //Checks if phone is null if phone is not equal to 10
        assertEquals("",test.getPhone());

    }

    /**
     * Tests address
     */
    @Test
    public void setAddress() {

        Contact test = new Contact();
        test.setAddress("123 street");
        //Checks if address is correct
        assertEquals("123 street", test.getAddress());

        test.setAddress("This is a long address this should not work");

        //Checks if address limit is correct
        assertTrue(test.getAddress().length() <= 30);

    }
}