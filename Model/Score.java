package Model;

public class Score {

    private int playerOneScore;
    private int playerTwoScore;
    private final int MAX_SCORE; // Defines how many points needed till win
    private int gameOver;

    public Score(){
        this(5);
    }
    public Score(int MAX_SCORE){
        playerOneScore = 0;
        playerTwoScore = 0;
        this.MAX_SCORE = MAX_SCORE;
        gameOver = 0;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public void incPlayerOneScore() {
        this.playerOneScore++;
        if(this.playerOneScore >= this.MAX_SCORE){
            gameOver = 1;
        }
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void incPlayerTwoScore() {
        this.playerTwoScore++;
        if(this.playerTwoScore >= this.MAX_SCORE){
            gameOver = 2;
        }
    }

    public int getGameOver(){
        return gameOver;
    }
}