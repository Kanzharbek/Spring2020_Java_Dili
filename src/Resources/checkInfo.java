package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);
        // System.out.println(PersonalInfo.age); age: is static default
        // System.out.println(PersonalInfo.ssn); ssn: is private
        // System.out.println(PersonalInfo.id); id: is private

        PersonalInfo obj1 = new PersonalInfo();
        System.out.println(obj1.name); // public
        System.out.println(obj1.gender); // public
        // System.out.println(obj1.age); age is default
        // System.out.println(obj1.grade); grade is default
        // System.out.println(obj1.ssn); ssn is private

    }
}
