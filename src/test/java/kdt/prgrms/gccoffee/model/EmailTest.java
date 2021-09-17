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
        assertTrue(email.getAddress().equals("hello@naver.com"));
    }
}