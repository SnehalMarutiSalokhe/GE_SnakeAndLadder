import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int position = 0 , startPosition=0;
        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Starting position of the player: " + startPosition);

        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("Die rolled: " + dieRoll);

        int option = random.nextInt(3);
        // 0: No Play, 1: Ladder, 2: Snake
        switch (option) {
            case 0:
                System.out.println("Option: No Play. Player stays at position: " + position);
                break;
            case 1:
                position += dieRoll;
                System.out.println("Option: Ladder. Player moves to position: " + position);
                break;
            case 2:
                position -= dieRoll;
                if (position < 0) position = 0;
                System.out.println("Option: Snake. Player moves to position: " + position);
                break;
        }
    }
}

