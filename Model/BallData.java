package Model;
/***************************************
* Filename: BallData.java
* Short description: This class stores data for the ball component
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
public class BallData {
    private int x;
    private int y;
    private int dirX; // Represents direction ball is moving in, and by how much
    private int dirY; // These values will likely not change in submitted version, but could eventually
    private int width;
    private int height;

    public BallData(){
        this(495, 275, 4, 3, 25, 25); // TODO Adjust using getHeight method of FieldPanel
    }

    public BallData(int x, int y, int dirX, int dirY, int width, int height) {
        this.x = x;
        this.y = y;
        this.dirX = dirX;
        this.dirY = dirY;
        this.width = width;
        this.height = height;
    }

    public void resetBallPosition(){
        this.x = 495;
        this.y = 275;
        this.dirX = 3;
        this.dirY = 3;
    }

    public void resetBallPosition(int ballX, int ballY, int ballDirX, int ballDirY){
        this.x = ballX;
        this.y = ballY;
        this.dirX = ballDirX;
        this.dirY = ballDirY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirX() {
        return dirX;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public int getDirY() {
        return dirY;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}