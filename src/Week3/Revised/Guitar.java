package Week3.Revised;

public class Guitar {
    private final String serialNumber;
    private final double price;
    private GuitarSpec guitarSpec;


    public Guitar(String serialNumber, double price, Builder builder, String model,
                  Type type, NumString numString, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        setGuitarSpec(new GuitarSpec(builder, model, type, numString, backWood, topWood));
    }

    public boolean specMatches(GuitarSpec searchSpec) {
        return getGuitarSpec().matches(searchSpec);
    }

    public Object getSerialNumber() {
        return serialNumber;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    public double getPrice() {
        return price;
    }
}
