package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testCreateUserWithoutPassword() {
        User user1 = new User("Pikachu68");
        assertEquals("Pikachu68", user1.getUsername());
        assertNull(user1.getPassword());

        User user2 = new User("Bulbasaur69", "iloveyou55");
        assertEquals("Bulbasaur69", user2.getUsername());
        assertNotNull(user2.getPassword());
    }

    @Test
    public void testSetPassword() {
        User user1 = new User("Neko");
        user1.setPassword("newPassword456");
        assertNotNull(user1.getPassword());
        assertNotEquals("newPassword456", user1.getPassword()); // Check ว่าเปลี่ยนแล้ว
    }

    @Test
    public void testValidatePassword() {
        User user1 = new User("Antony58", "youlovemeandiloveyou");
        assertTrue(user1.validatePassword("youlovemeandiloveyou"));
        assertFalse(user1.validatePassword("55555555555555"));
    }

    @Test
    public void testIsUsername() {
        User user1 = new User("TongLongRidz", "uuei5858");
        assertTrue(user1.isUsername("TongLongRidz"));
        assertFalse(user1.isUsername("CokePepsiZa"));
    }
}