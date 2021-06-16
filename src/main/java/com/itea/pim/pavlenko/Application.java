package com.itea.pim.pavlenko;

import com.itea.pim.pavlenko.user.User;

public class Application {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("Иван");
        user1.setLastName("Иванов");
        user1.setLogin("Ivan");
        user1.setPassword("11111111");
        user1.setEMail("ivan@ivan.com");
        User user2 = new User();
        user2.setFirstName("Петр");
        user2.setLastName("Петров");
        user2.setLogin("Peter");
        user2.setPassword("22222222");
        user2.setEMail("peter@peter.com");
        User user3 = new User();
        user3.setFirstName("Николай");
        user3.setLastName("Николаев");
        user3.setLogin("Nik");
        user3.setPassword("33333333");
        user3.setEMail("nik@nik.com");

//        Tv tv1 = new Tv(12345);
//        Phone phone1 = new Phone(12345, "eco");
//        user3.info();
//        tv1.info();
//        phone1.info();

    }
}
