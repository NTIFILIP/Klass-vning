public class Hamburgare {
    String breadType;
    String meatType;
    String[] toppings;
    boolean isEaten = false;

    public Hamburgare(String breadType, String meatType, String[] toppings) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.toppings = toppings;
    }

    public void Eat() {
        this.isEaten = false;
    }
}
