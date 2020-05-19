package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_test {

    public static void main(String[] args) {
        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.publicAccess);
        System.out.println(obj1.pubStatVar);
        // System.out.println(obj1.defaultAccess); // default is accessible only in the same package
        // System.out.println(obj1.ssn); no access: ssn is private variable

    }
}
