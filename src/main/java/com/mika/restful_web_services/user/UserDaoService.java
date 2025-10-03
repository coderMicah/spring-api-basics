package com.mika.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Jane Doe", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "John Doe", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Anna Doe", LocalDate.now().minusYears(8)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
