package org.example;

import org.example.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private User billy;

    //Setup
    @Before
    public void setUp(){
        billy = new User("billy@gmail.com","billy", "TheTrueBilly", LocalDate.now().minusYears(25));
    }

    @Test
    public void testUserShouldBeValid() {
        assertTrue(billy.isValid());
    }

    @Test
    public void testMailUserShouldBeFalse() {
        billy.setEmail("test");
        assertFalse(billy.isValid());
    }

    @Test
    public void testAgeUserShouldBeFalse() {
        billy.setBirthDate(LocalDate.now().minusYears(12));
        assertFalse(billy.isValid());
    }

    @Test
    public void testNameUndefined() {
        billy.setName(null);
        assertFalse(billy.isValid());
    }

    @Test
    public void testNameEmpty() {
        billy.setName("");
        assertFalse(billy.isValid());
    }

    @Test
    public void testSurnameUndefined() {
        billy.setSurname(null);
        assertFalse(billy.isValid());
    }

    @Test
    public void testSurnameEmpty() {
        billy.setSurname("");
        assertFalse(billy.isValid());
    }
}
