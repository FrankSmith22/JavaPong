package Model;

public class Ball {
    int ballX;
    int ballY;
    int ballRadius;
    int ballDirX; // Represents direction ball is moving in, and by how much
    int ballDirY; // These values will likely not change in submitted version, but could eventually

    public Ball(){
        this(490, 340, 10, 3, 3); // TODO Adjust using getHeight method of FieldPanel
    }

    public Ball(int ballX, int ballY, int ballRadius, int ballDirX, int ballDirY) {
        this.ballX = ballX;
        this.ballY = ballY;
        this.ballRadius = ballRadius;
        this.ballDirX = ballDirX;
        this.ballDirY = ballDirY;
    }

    public void resetBallPosition(){
        this.ballX = 490;
        this.ballY = 340;
        this.ballRadius = 10;
        this.ballDirX = 3;
        this.ballDirY = 3;
    }

    public void resetBallPosition(int ballX, int ballY, int ballRadius, int ballDirX, int ballDirY){
        this.ballX = ballX;
        this.ballY = ballY;
        this.ballRadius = ballRadius;
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

    public int getBallRadius() {
        return ballRadius;
    }

    public void setBallRadius(int ballRadius) {
        this.ballRadius = ballRadius;
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