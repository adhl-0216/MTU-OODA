package Week3.Revised;


import java.util.List;
import java.util.Scanner;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Search by guitar specifications:\n1.Builder\n2.Model\n3.Type\n4.Back Wood\n5.Top Wood");
        String category = scanner.nextLine();

        //        what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec();
        if(category.equalsIgnoreCase("Builder") || category.equals("1")){
            System.out.println("Which builder are you looking for?");
            String builder = scanner.nextLine();
            switch (builder.toLowerCase()) {
                case "fender" -> whatLookingFor.setBuilder(Builder.FENDER);
                case "gibson" -> whatLookingFor.setBuilder(Builder.GIBSON);
                case "collins" -> whatLookingFor.setBuilder(Builder.COLLINS);
                case "yamaha" -> whatLookingFor.setBuilder(Builder.YAMAHA);
            }

        } else if (category.equalsIgnoreCase("Model") || category.equals("2")) {
            System.out.println("Which model are you looking for?");
            String model = scanner.nextLine();
            whatLookingFor.setModel(model);

        }else if (category.equalsIgnoreCase("Type") || category.equals("3")) {
            System.out.println("Which type are you looking for?");
            String type = scanner.nextLine();
            switch (type.toLowerCase()) {
                case "electric" -> whatLookingFor.setType(Type.ELECTRIC);
                case "acoustic" -> whatLookingFor.setType(Type.ACOUSTIC);
            }

        }else if (category.equalsIgnoreCase("Back Wood") || category.equals("4")) {
            System.out.println("Which back wood are you looking for?");
            String backWood = scanner.nextLine();
            switch (backWood.toLowerCase()) {
                case "cedar" -> whatLookingFor.setBackWood(Wood.CEDAR);
                case "alder" -> whatLookingFor.setBackWood(Wood.ALDER);
                case "mahogany" -> whatLookingFor.setBackWood(Wood.MAHOGANY);
            }

        }else if (category.equalsIgnoreCase("Top Wood") || category.equals("5")) {
            System.out.println("Which top wood are you looking for?");
            String topWood = scanner.nextLine();
            switch (topWood.toLowerCase()) {
                case "cedar" -> whatLookingFor.setTopWood(Wood.CEDAR);
                case "alder" -> whatLookingFor.setTopWood(Wood.ALDER);
                case "mahogany" -> whatLookingFor.setTopWood(Wood.MAHOGANY);
            }

        }




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
