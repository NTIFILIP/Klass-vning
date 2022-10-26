import java.util.Random;

public class Tärning {
    final int numSides;
    int sideLength;
    double weight;
    String material;
    String color;
    int numberUp;
    Random rng;

    public Tärning(int numSides, int sideLength, double weight, String material, String color) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.weight = weight;
        this.material = material;
        this.color = color;

        this.numberUp = numSides;
        this.rng = new Random();
    }

    public int Kasta() {
        int randomNumber = rng.nextInt(this.numSides) + 1;
        this.numberUp = randomNumber;
        return  randomNumber;
    }

    public int getNumberUp() {
        return numberUp;
    }
}
