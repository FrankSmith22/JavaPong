package Model;

public class BallData {
    private int ballX;
    private int ballY;
    private int ballDirX; // Represents direction ball is moving in, and by how much
    private int ballDirY; // These values will likely not change in submitted version, but could eventually

    public BallData(){
        this(495, 275, 3, 3); // TODO Adjust using getHeight method of FieldPanel
    }

    public BallData(int ballX, int ballY, int ballDirX, int ballDirY) {
        this.ballX = ballX;
        this.ballY = ballY;
        this.ballDirX = ballDirX;
        this.ballDirY = ballDirY;
    }

    public void resetBallPosition(){
        this.ballX = 495;
        this.ballY = 275;
        this.ballDirX = 3;
        this.ballDirY = 3;
    }

    public void resetBallPosition(int ballX, int ballY, int ballDirX, int ballDirY){
        this.ballX = ballX;
        this.ballY = ballY;
        this.ballDirX = ballDirX;
        this.ballDirY = ballDirY;
    }

    public int getBallX() {
        return ballX;
    }

    public void setBallX(int ballX) {
        this.ballX = ballX;
    }

    public int getBallY() {
        return ballY;
    }

    public void setBallY(int ballY) {
        this.ballY = ballY;
    }
    
    public int getBallDirX() {
        return ballDirX;
    }

    public void setBallDirX(int ballDirX) {
        this.ballDirX = ballDirX;
    }

    public int getBallDirY() {
        return ballDirY;
    }

    public void setBallDirY(int ballDirY) {
        this.ballDirY = ballDirY;
    }
}