import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int player1Position = 0, player2Position = 0, diceRolls = 0;

        boolean isPlayer1Turn = true;
        final int WINNING_POSITION = 100;

        Random random = new Random();

        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Starting position of the Both players: " + player2Position);


        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            diceRolls++;
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            if (isPlayer1Turn) {
                player1Position = updatePosition(player1Position, dieRoll, option, WINNING_POSITION);
                System.out.println("Player 1: Die = " + dieRoll + ", Position = " + player1Position);
                if (option == 1) isPlayer1Turn = true;
                player2Position = updatePosition(player2Position, dieRoll, option, WINNING_POSITION);
                System.out.println("Player 2: Die = " + dieRoll + ", Position = " + player2Position);
                if (option == 1) isPlayer1Turn = false;
            }
            isPlayer1Turn = !isPlayer1Turn;
        }
        if (player1Position == WINNING_POSITION) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    private static int updatePosition(int position, int dieRoll, int option, int winningPosition) {
        switch (option) {
            case 0:
                break;
            case 1:
                if (position + dieRoll <= winningPosition) {
                    position += dieRoll; // Ladder
                }
                break;
            case 2:
                position -= dieRoll; // Snake
                if (position < 0) position = 0;
                break;
        }
        return position;

    }
}

