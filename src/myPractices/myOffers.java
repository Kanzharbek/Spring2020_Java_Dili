package myPractices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    /*
    create a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for full time position
					2. offer is from your local area
					3. salary is greater than 100K
     */
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Sunnyvale, CA", "Google", 150000, false);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Mountain View, CA", "Apple", 100000, false);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Santa Clara, CA, CA", "LinkedIn", 110000, true);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("San Francisco, CA", "AirBnB", 95000, true);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("Phoenix, AZ", "AMEX", 98000, false);

        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};
        for (Offer each : offers) {
            System.out.println(each);
        }

        System.out.println("=======================================================================");

        ArrayList<Offer> fullTimeOffer = new ArrayList<>(Arrays.asList(offers)); // to store full time offers
        fullTimeOffer.removeIf(p -> !p.isFullTime); // remove if offer is not full time
        System.out.println("These offers are full time position");
        for (Offer each : fullTimeOffer) {
            System.out.println(each);
        }

        System.out.println("=======================================================================");

        ArrayList<Offer> salaries = new ArrayList<>(Arrays.asList(offers)); //
        salaries.removeIf(p -> p.salary < 100000);
        System.out.println("These offers salaries more than 100K");
        for (Offer each : salaries) {
            System.out.println(each);
        }

        System.out.println("=======================================================================");

        ArrayList<Offer> localOffer = new ArrayList<>(Arrays.asList(offers));
        localOffer.removeIf(p -> !p.location.endsWith(",CA"));
        System.out.println("These are local offers");
        for(Offer each : localOffer){
            System.out.println(each);
        }




    }
}
