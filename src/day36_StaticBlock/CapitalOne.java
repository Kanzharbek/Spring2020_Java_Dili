package day36_StaticBlock;

public class CapitalOne {

    public static void main(String[] args) {
        System.out.println(HumanResources.dev1);
        System.out.println(HumanResources.dev2);

        HumanResources.dev1.setInfo("Saia", "Developer", 130_000, 19931); // changed
        System.out.println(HumanResources.dev1);
    }
}
