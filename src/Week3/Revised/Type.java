package Week3.Revised;

public enum Type {
    ELECTRIC, ACOUSTIC;

    public String toString(){
        return switch (this) {
            case ELECTRIC -> "Electric";
            case ACOUSTIC -> "Acoustic";
        };
    }
}
