package cleancode;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        if (player1Score == player2Score) {
            score = new StringBuilder(check(player1Score));
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = new StringBuilder(checkWin(player1Score, player2Score));
        } else {
            DisplayPoint(player1Score, player2Score, score);
        }
        return score.toString();
    }

    private static void DisplayPoint(int player1Score, int player2Score, StringBuilder score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score.append("-");
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }

    private static String check(int player1Score) {
        String score;
        switch (player1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String checkWin(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        boolean isPlayer1AdvPlayer2 = minusResult == 1;
        if (isPlayer1AdvPlayer2) score = "Advantage player1";
        else {
            boolean isPlayer2AdvPlayer1 = minusResult == -1;
            if (isPlayer2AdvPlayer1) score = "Advantage player2";
            else {
                boolean isPlayer1Win = minusResult >= 2;
                if (isPlayer1Win) score = "Win for player1";
                else score = "Win for player2";
            }
        }
        return score;
    }
}