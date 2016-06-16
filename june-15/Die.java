public class Die {
    private int faceUp;

    public Die(int face) {
        faceUp = (face % 6) + 1;
    }

    public Die() {
        faceUp = 1;
    }

    public int getFace() {
        return this.faceUp;
    }

    public void roll() {
        this.faceUp = 1 + (int) Math.random() % 6;
    }

    public String toString() {
        return String.format("Die: %d!", faceUp);
    }

    public static void main(String[] args) {
        Die d = new Die(3);

        System.out.println("The current face is: " + d.getFace());

        System.out.println("Our die prints as: " + d);
    }
}
