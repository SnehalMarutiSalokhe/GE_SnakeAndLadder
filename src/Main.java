import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int position = 0 , startPosition=0;
        int diceRolls = 0;
        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Starting position of the player: " + startPosition);

        Random random = new Random();
        final int WINNING_POSITION = 100;

        while (position < WINNING_POSITION) {
            diceRolls++;
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {
                case 0:
                    break;
                case 1:
                    if (position + dieRoll <= WINNING_POSITION)
                    position += dieRoll;
                    break;
                case 2:
                    position -= dieRoll;
                    if (position < 0) position = 0;
                    break;
            }
            System.out.println("Dice roll " + diceRolls + ": Die = "
                    + dieRoll + ", Position = " + position);
        }
        System.out.println("Player has won the game!");
        }

}

