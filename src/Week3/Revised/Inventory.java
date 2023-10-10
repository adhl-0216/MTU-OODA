package Week3.Revised;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, NumString numString, Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type, numString, backWood,topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();

        for (Guitar guitar : guitars) {

            if (guitar.specMatches(searchSpec)) matchingGuitars.add(guitar);

        }
        return matchingGuitars;
    }
}
