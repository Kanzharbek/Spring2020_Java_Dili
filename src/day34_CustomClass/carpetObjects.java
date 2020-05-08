package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7, 8.5, 20, true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9, 20, 15, true);
        carpets[3].customOrder(20, 18, 25, false);
        carpets[4].customOrder(35, 45, 35, true);
        System.out.println(carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);
        System.out.println(carpets[3]);
        System.out.println(carpets[4]);

        System.out.println("==============================================");

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        for (Carpet each : carpets) {
            if (each.isPersian) {
                persianCarpets.add(each);
            }
        }
        System.out.println("There are: " + persianCarpets.size() + " persian carpets.");
        System.out.println(persianCarpets.get(0).calcCost());
        System.out.println(persianCarpets.get(1).calcCost());

        System.out.println("===================================================");

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);
        System.out.println("There are " + regularCarpets.size() + " regular carpets");
        System.out.println(regularCarpets.get(0).calcCost());

        System.out.println("===================================================");

        for (int i = 0; i < regularCarpets.size(); i++) {
            System.out.println(regularCarpets.get(i).calcCost());
        }

    }
}
