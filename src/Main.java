import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int position = 0 , startPosition=0;
        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Starting position of the player: " + startPosition);

        Random random = new Random();
        final int WINNING_POSITION = 100;

        while (position < WINNING_POSITION) {
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {
                case 0:
                    break;
                case 1:
                    position += dieRoll;
                    break;
                case 2:
                    position -= dieRoll;
                    if (position < 0) position = 0;
                    break;
            }
            System.out.println("Current position: " + position);
        }
        System.out.println("Player has won the game!");
        }

}

