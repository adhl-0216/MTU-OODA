package Week3.Revised;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
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

            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant

            if (guitarSpec.getBuilder().equals(searchSpec.getBuilder())){
                matchingGuitars.add(guitar);
            }

            else if (guitarSpec.getModel().equalsIgnoreCase(searchSpec.getModel()))
            {
                matchingGuitars.add(guitar);
            }

            else if (guitarSpec.getType().equals(searchSpec.getType()))
            {
                matchingGuitars.add(guitar);
            }

            else if (guitarSpec.getBackWood().equals(searchSpec.getBackWood()))
            {
                matchingGuitars.add(guitar);
            }

            else if (guitarSpec.getTopWood().equals(searchSpec.getTopWood()))
            {
                matchingGuitars.add(guitar);
            }

        }
        return matchingGuitars;
    }
}
