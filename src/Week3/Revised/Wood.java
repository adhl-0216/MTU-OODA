package Week3.Revised;

public enum Wood {
    CEDAR, ALDER, MAHOGANY;
    public String toString(){
        return switch (this) {
            case CEDAR -> "Cedar";
            case ALDER -> "Alder";
            case MAHOGANY -> "Mahogany";
        };
    }
}
