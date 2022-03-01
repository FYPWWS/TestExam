package ie.gmit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStudent {

    Student student;
    @BeforeEach
    void init()
    {
        student = new Student();
        student.Name = "Bob";
        student.Email = "Bob@gmit.ie";
    }

    @Test
    public void testName()
    {
        Assertions.assertFalse(student.Name.isEmpty());
    }

    @Test
    public void testNameFail()
    {
        Exception e = Assertions.assertThrows();
        Assertions.assertEquals("ERROR!", e.getMessage());
    }

    @Test
    public void testEmail()
    {
        Assertions.assertFalse(student.Email.isEmpty());
    }

}
