package Week3.Revised;

import java.util.LinkedList;
import java.util.List;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec() {
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder=" + builder +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                '}';
    }

    public boolean matches(GuitarSpec searchSpec) {

            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant

            if (this.getBuilder().equals(searchSpec.getBuilder())){
                return true;
            }

            else if (this.getModel().equalsIgnoreCase(searchSpec.getModel()))
            {
                return true;
            }

            else if (this.getType().equals(searchSpec.getType()))
            {
                return true;
            }

            else if (this.getBackWood().equals(searchSpec.getBackWood()))
            {
                return true;
            }

            else return this.getTopWood().equals(searchSpec.getTopWood());
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }


}
