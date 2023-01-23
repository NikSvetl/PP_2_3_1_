package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class UserTest {

    private final UserService userService;

    @Autowired
    public UserTest(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void testUser() {
        userService.addUser(new User("Ivan", "Ivanov", 20));
        userService.addUser(new User("Petr", "Petrov", 25));
        userService.addUser(new User("Vasya", "Popov", 30));
        userService.addUser(new User("Ignat", "Mamedov", 35));
    }
}
