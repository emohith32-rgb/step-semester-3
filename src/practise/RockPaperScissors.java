package practise;

import java.util.Random;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        Random random = new Random();

        int rounds = 5;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[][] roundData = new String[rounds][4];

        for (int i = 0; i < rounds; i++) {
            String playerMove = playerMoves[i];
            String computerMove = moves[random.nextInt(moves.length)];
            String result = playRound(playerMove, computerMove);

            roundData[i][0] = String.valueOf(i + 1);
            roundData[i][1] = playerMove;
            roundData[i][2] = computerMove;
            roundData[i][3] = result;

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.printf("Round %d\nPlayer: %s, Computer: %s\nOutput: %s\n\n", 
                              i + 1, playerMove, computerMove, result);
        }

        System.out.println("Final Summary (after 5 rounds)");
        System.out.printf("%-7s | %-12s | %-14s | %-13s\n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-7s | %-12s | %-14s | %-13s\n", 
                              roundData[i][0], roundData[i][1], roundData[i][2], roundData[i][3]);
        }

        double winPercentage = ((double) wins / rounds) * 100;
        System.out.printf("\nWins: %d | Losses: %d | Draws: %d | Win %%=%.1f%%\n", 
                          wins, losses, draws, winPercentage);
    }
}