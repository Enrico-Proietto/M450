package ch.app.bookoasis.Tests;

import ch.app.bookoasis.Data.User.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Test
    public void createUser() {
        User testUser = new User();
    }
}
