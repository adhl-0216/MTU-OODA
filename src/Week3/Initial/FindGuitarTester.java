package Week3.Initial;

import java.util.List;
import java.util.Set;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        Guitar whatLookingFor = new Guitar("", 0, "", "",
                "Electric", "","");

        List<Guitar> matches = inventory.search(whatLookingFor);

        if (matches !=null){
            for (Guitar guitar :
                    matches) {

            System.out.println("You might like this: " + guitar.getSerialNumber() + " " +
                    guitar.getPrice()); //and whatever other details you desire
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }


    }

    private static void initialiseInventory(Inventory inventory) {
        inventory.addGuitar("V00001",
                1499.99,
                "Fender" ,
                "Stratocastor",
                "Electric",
                "Alder",
                "Alder");

        inventory.addGuitar("V00002",
                1699.99,
                "Fender",
                "Stratocastor",
                "Acoustic",
                "Alder",
                "Alder");

        inventory.addGuitar("V00003",
                899.99,
                "Fender" ,
                "Stratocastor",
                "Electric",
                "Alder",
                "Alder");

    }
}
