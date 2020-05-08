package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class offerObjects {

    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("CA", "Deloitte", 115000, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Uber", 110000, false);

        Offer offer3 = new Offer();
        offer3.setInfo("VA", "Capital One", 98000, true);

        Offer offer4 = new Offer();
        offer4.setInfo("AZ", "AMEX", 100000, false);

        Offer[] offers = {offer1, offer2, offer3, offer4};

        ArrayList<Offer> accept = new ArrayList<>(Arrays.asList(offers)); // to store offers which salary is more 100K

        accept.removeIf(p -> p.salary < 100000 || p.isFullTime == false || !p.location.equals("CA"));
        // remove if:   salary is less than 100K ,   is not full time ,      location is not CA

        for (Offer each : accept) {
            System.out.println(each);
        }

    }

}
