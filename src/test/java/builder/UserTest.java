package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testToString() {
        User user = User.builder().firstName("Bohdan").lastName("Ivashko").build();
        assertEquals("Bohdan", user.getFirstName());
        assertEquals(0, user.getAge());
    }
}