package tests;
import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import Contact.java;


public class ContactTest {

    public void contactAdd(){
        int i = manage.friendCounter();
        manage.addContact(new Contact("Jordi","test@gmail.com","0613841645"));
        Assert.assertEquals(i++, manage.friendCounter());
    }

}
