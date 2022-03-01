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
    }

    @Test
    public void testName()
    {
        Assertions.assertFalse(student.Name.isEmpty());
    }

    @Test
    public void testEmail()
    {
        Assertions.assertFalse(student.Email.isEmpty());
    }

}
