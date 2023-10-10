package Week4;

public class DogDoor {

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door is opening");
        open=true;
    }
    public void close(){
        System.out.println("The dog door is closing");
        open=false;
    }

    //returns the state of the door
    public boolean isOpen(){
        return open;
    }

}
