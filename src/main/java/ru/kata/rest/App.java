package ru.kata.rest;

import ru.kata.rest.entity.User;

import java.util.List;

public class App {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(Pp315Application.class);
//        Communication communication = context.getBean("communication", Communication.class);
        Communication communication = new Communication();
        List<User> allUsers = communication.getAllUsers();

        User user = new User(3L, "James", "Brown", (byte) 25);
        communication.saveUsers(user);

        user.setName("Thomas");
        user.setLastName("Shelby");
        communication.updateUsers(user);

        communication.deleteUsers(3L);
    }
}
