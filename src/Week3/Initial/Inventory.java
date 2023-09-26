package Week3.Initial;

import java.util.*;

public class Inventory {
    private List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model,
                          String type,  String backWood, String topWood)
    {
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {

//        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
//            Guitar guitar = (Guitar) i.next();
//            //ignore serialNumber since it is unique
//            //ignore price since it is irrelevant
//
////            String builder = searchGuitar.getBuilder();
////            if((builder !=null) && (!builder.equals("")) &&
////                    (!builder.equals(guitar.getBuilder())))
////                continue;
//            if(!guitar.getBuilder().equals(searchGuitar.getBuilder())) continue;
//
////            String model = searchGuitar.getModel();
////            if ((model != null) && (!model.equals("")) &&
////                    (!model.equals(guitar.getModel())))
////                continue;
//            if(!guitar.getModel().equals(searchGuitar.getModel())) continue;
//
////            String type = searchGuitar.getType();
////            if ((type != null) && (!searchGuitar.equals("")) &&
////                    (!type.equals(guitar.getType())))
////                continue;
//            if(!guitar.getType().equals(searchGuitar.getType())) continue;
//
////            String backWood = searchGuitar.getBackwood();
////            if ((backWood != null) && (!backWood.equals("")) &&
////                    (!backWood.equals(guitar.getBackwood())))
////                continue;
//            if(!guitar.getBackwood().equals(searchGuitar.getBackwood())) continue;
//
////            String topWood = searchGuitar.getBackwood();
////            if ((topWood != null) && (!topWood.equals("")) &&
////                    (!topWood.equals(guitar.getTopwood())))
////                continue;
//            if(!guitar.getTopwood().equals(searchGuitar.getTopwood())) continue;
//
//            matches.add(guitar);
//
//        }
        return guitars.stream().filter((guitar)->
            guitar.getBuilder().equals(searchGuitar.getBuilder()) ||
            guitar.getModel().equals(searchGuitar.getModel()) ||
            guitar.getType().equals(searchGuitar.getType()) ||
            guitar.getBackwood().equals(searchGuitar.getBackwood()) ||
            guitar.getTopwood().equals(searchGuitar.getTopwood())
        ).toList();
    }
}
