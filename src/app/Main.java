package app;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        int id;
        String email;

        UserRepository userRepository = new UserRepository();
        AtomicInteger count = new AtomicInteger(1);

        email = "alex.emp1@gmail.com";
        Optional<User> userByEmail = userRepository.findUserByEmail(email);
        System.out.println("\n" + count.getAndIncrement() + ")" + " The user by email is: " + userByEmail);

        id = 333;
        Optional<User> userById = userRepository.findUserById(id);
        System.out.println("\n" + count.getAndIncrement() + ")" + " The user by Id is: " + userById);

        Optional<List<User>> allUsers = userRepository.findAllUsers();
        System.out.println("\n" + count.getAndIncrement() + ")" + " All users: " + allUsers);

    }
}
