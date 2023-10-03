package Week3.Revised;


import java.util.List;
import java.util.Scanner;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which builder are you looking for?");
        String builder = scanner.nextLine();
//        what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec();
         switch (builder.toLowerCase()) {
            case "fender" -> whatLookingFor.setBuilder(Builder.FENDER);
            case "gibson" -> whatLookingFor.setBuilder(Builder.GIBSON);
            case "collins" -> whatLookingFor.setBuilder(Builder.COLLINS);
            case "yamaha" -> whatLookingFor.setBuilder(Builder.YAMAHA);
        };


        List<Guitar> matchingGuitars = inventory.search(whatLookingFor);

        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like these: ");

            for (Guitar guitar : matchingGuitars) {
                GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.out.printf("We have a %s %s %s guitar:  %s%n",
                        guitarSpec.getBuilder(),
                        guitarSpec.getModel(),
                        guitarSpec.getType(),
                        guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }


    }

    private static void initialiseInventory(Inventory inventory) {
        inventory.addGuitar("V00001",
                1499.99,
                Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
        );

        inventory.addGuitar("V00002",
                1699.99,
                Builder.FENDER ,
                "Stratocastor",
                Type.ACOUSTIC,
                Wood.ALDER,
                Wood.ALDER
        );

        inventory.addGuitar("V00003",
                799.99,
                Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
        );

        inventory.addGuitar("V00004",
                999.99,
                Builder.GIBSON ,
                "Stratocastor",
                Type.ACOUSTIC,
                Wood.CEDAR,
                Wood.CEDAR
        );

        inventory.addGuitar("V00005",
                1099.99,
                Builder.YAMAHA ,
                "Stratocastor",
                Type.ACOUSTIC,
                Wood.CEDAR,
                Wood.CEDAR
        );

    }
}
