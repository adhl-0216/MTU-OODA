import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PlanetEarth {
    private static class Human {
        private String name;
        private LocalDate doB;
        private Double heightInInches;
        private String eyeColour;

        public Human(String name, LocalDate doB, Double heightInInches, String eyeColour) {
            setName(name);
            setDoB(doB);
            setHeightInInches(heightInInches);
            setEyeColour(eyeColour);
        }

        public void speak(String words) {

            System.out.println(words);
        }
        public void eat() {

            System.out.println("I am eating...");
        }

        public void walk() {

            System.out.println("I am walking...");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDoB() {
            return doB;
        }

        public void setDoB(LocalDate doB) {
            this.doB = doB;
        }

        public Double getHeightInInches() {
            return heightInInches;
        }

        public void setHeightInInches(Double heightInInches) {
            this.heightInInches = heightInInches;
        }

        public String getEyeColour() {
            return eyeColour;
        }

        public void setEyeColour(String eyeColour) {
            this.eyeColour = eyeColour;
        }
    }

    public static void main(String[] args) {
        Human adrian = new Human("Adrian", LocalDate.of(2002, 2, 16), 73.0, "black" );


        adrian.speak("My name is " + adrian.getName());
        adrian.speak("My D.O.B is " + adrian.getDoB().toString());
        adrian.eat();
        adrian.walk();
    }
}
