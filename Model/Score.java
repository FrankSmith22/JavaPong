package Model;

public class Score {

    private int playerOneScore;
    private int playerTwoScore;
    private final int MAX_SCORE; // Defines how many points needed till win
    private boolean gameOver;

    public Score(){
        this(5);
    }
    public Score(int MAX_SCORE){
        playerOneScore = 0;
        playerTwoScore = 0;
        this.MAX_SCORE = MAX_SCORE;
        gameOver = false;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public void incPlayerOneScore() {
        this.playerOneScore++;
        if(this.playerOneScore >= this.MAX_SCORE){
            gameOver = true;
        }
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void incPlayerTwoScore() {
        this.playerTwoScore++;
        if(this.playerTwoScore >= this.MAX_SCORE){
            gameOver = true;
        }
    }

    public boolean getGameOver(){
        return gameOver;
    }
}