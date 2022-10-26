import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tärning tärning = new Tärning(6, 2, 1.5d, "Sten", "Blå");
        while (true) {
            System.out.println(tärning.Kasta());
            scanner.nextLine();
        }
    }
}