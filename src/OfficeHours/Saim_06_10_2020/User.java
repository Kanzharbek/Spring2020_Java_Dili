package OfficeHours.Saim_06_10_2020;

public class User {
    public static void main(String[] args) {
        facebook user1 = new facebook("java5", "kesda");
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());

        user1.setPassword("java5");
        System.out.println(user1.getPassword());

        facebook user2 = new facebook("jamesB", "pass007", "Jam7es Bond");
        System.out.println(user2.getUsername());
        System.out.println(user2.getPassword());
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        System.out.println(user2.getFullName());




    }
}
