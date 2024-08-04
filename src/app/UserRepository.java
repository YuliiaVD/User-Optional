package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private final List<User> listUsers = Arrays.asList(
            new User(111, "Alex", "alex.emp1@gmail.com"),
            new User(222, "Anna", "an.emp2@gmail.com"),
            new User(333, "John", "jo.emp3@gmail.com"),
            new User(444, "Maria", "ma.emp4@gmail.com"),
            new User(555, "Manuel", "man.emp5gmail.com")
    );


    public Optional<User> findUserByEmail(String email) {
        for (User user : listUsers) {
            if (user.getEmail().equals(email))
                return Optional.of(user);
        }
        return Optional.empty();

    }

    public Optional<User> findUserById(int id) {
        for (User user : listUsers) {
            if (user.getId() == id)
                return Optional.of(user);
        }
        return Optional.empty();
    }

    public Optional<List<User>> findAllUsers() {
        return Optional.of(listUsers);
    }
}
