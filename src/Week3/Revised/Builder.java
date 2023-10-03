package Week3.Revised;

public enum Builder {
    FENDER, GIBSON, COLLINS, YAMAHA;


    public String toString(){
        return switch (this) {
            case FENDER -> "Fender";
            case GIBSON -> "Gibson";
            case COLLINS -> "Collins";
            case YAMAHA -> "Yamaha";
        };
    }
}
