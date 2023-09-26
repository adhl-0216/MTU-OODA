package Week3.Revised;

public enum Builder {
    FENDER, GIBSON, COLLINS, YAMAHA;
    public String toString(){
        switch(this){
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case COLLINS: return "Collins";
            case YAMAHA: return "Yamaha";
            default: return "Fender";
        }
    }
}
