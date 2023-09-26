package Week3.Revised;

public enum Wood {
    CEDAR, ALDER, MAHOGANY;
    public String toString(){
        switch(this){
            case CEDAR: return "Cedar";
            case ALDER: return "Alder";
            case MAHOGANY: return "Mahogany";
            default: return "Cedar";
        }
    }
}
