public class SimpleAbstraction {

    private static class Dice {

        private int faceValue;

        public Dice() {

        }

        public int getFaceValue() {
            return faceValue;
        }

        public void setFaceValue(int faceValue) {
            this.faceValue = faceValue;
        }

        public void roll() {
            int value = (int) (Math.random() * 6 - 1) + 1;
            setFaceValue(value);
        }
    }

    private static class Player {

        public Player() {
        }

        public boolean isWinner() {

            Dice d1 = new Dice();
            Dice d2 = new Dice();

            d1.roll();
            d2.roll();

            return d1.getFaceValue() + d2.getFaceValue() == 7;
        }
    }

    public static void main(String[] args) {


        Player p1 = new Player();

        System.out.println("You " + (p1.isWinner() ? "Win" : "Lose"));
    }
}
