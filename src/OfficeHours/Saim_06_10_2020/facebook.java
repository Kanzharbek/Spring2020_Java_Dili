package OfficeHours.Saim_06_10_2020;

import java.util.ArrayList;

public class facebook extends SocialMedia implements Groups {
    // encapsulation: all vars are private
    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private int numberOfGroups;
    private ArrayList<Post> allPosts;

    static { // static block: assigning value for platform. platform inherited from Social Media abstract class
        platform = "Facebook";
    }

    // constructor
    public facebook(String username, String password) {
        setUsername(username);
        setPassword(password);
        personalUrl = "Facebook.com/" + username; // inherited from SocialMedia abstract class
        accountLength = 0; // inherited from SocialMedia abstract class
        allPosts = new ArrayList<>();
    }

    public facebook(String username, String password, String fullName) {
        this(username, password);
        this.fullName = fullName;
    }

    public facebook(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    // creating public getter and setter for all private vars
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(username)) {
            System.out.println("Invalid password, username is in password");
            password = "0000";
        }
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        boolean isValid = true;
        String check = fullName.replace(" ", "");
        for (int i = 0; i < check.length(); i++) {
            if (Character.isLetter((check.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            this.fullName = fullName;
        } else {
            System.out.println("Not a valid name");
            this.fullName = "no name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            age = 0;
        }
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if (numberOfFriends > 0) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
            this.numberOfFriends = 0;
        }
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    //Overriding abstract methods from extended abstract class Social Media:
    @Override
    public boolean directMessage(String username, String message) {
        if (message.isEmpty()) { // if message is empty return flase
            return false;
        }
        System.out.println("Sent " + message + " to " + username);
        return true;
    }

    @Override
    public boolean createPost(String body) {
        allPosts.add(new Post(body)); // body: is input from the user
        return true;
    }

    @Override
    public void notification(int time) {

    }

    // Overriding methods from Post class
    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    // Overriding a method from interface Groups
    @Override
    public boolean joinGroup(String name) {
        System.out.println(fullName + " welcome to " + name);
        numberOfGroups++;
        return true;
    }

    @Override // Overriding a method from interface Groups
    public boolean leaveGroup(String name) {
        System.out.println(fullName + " do you really want to leave? " + name);
        numberOfGroups--;
        return true;
    }
}
