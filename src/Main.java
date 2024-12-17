import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Starting position of the player: " + startPosition);

        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("Die rolled: " + dieRoll);
    }
}

