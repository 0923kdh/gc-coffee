package kdt.prgrms.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->{
            Email email = new Email("acccc");
        });
    }

    @Test
    public void testValidEmail(){
        Email email = new Email("hello@naver.com");
        assertEquals("hello@naver.com", email.getAddress());
    }

    @Test
    public void testEqualsEmail(){
        Email email1 = new Email("hello@naver.com");
        Email email2 = new Email("hello@naver.com");
        assertEquals(email1, email2);
    }
}