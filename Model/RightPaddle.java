package Model;

public class RightPaddle {
    int rightPaddleX;
    int rightPaddleY;
    int rightPaddleHeight;
    int rightPaddleWidth;

    public RightPaddle(){
        this(990, 650, 100, 20); // TODO Adjust using getHeight method of FieldPanel
    }

    public RightPaddle(int rightPaddleX, int rightPaddleY, int rightPaddleHeight, int rightPaddleWidth) {
        this.rightPaddleX = rightPaddleX;
        this.rightPaddleY = rightPaddleY;
        this.rightPaddleHeight = rightPaddleHeight;
        this.rightPaddleWidth = rightPaddleWidth;
    }

    public int getRightPaddleX() {
        return rightPaddleX;
    }

    public void setRightPaddleX(int rightPaddleX) {
        this.rightPaddleX = rightPaddleX;
    }

    public int getRightPaddleY() {
        return rightPaddleY;
    }

    public void setRightPaddleY(int rightPaddleY) {
        this.rightPaddleY = rightPaddleY;
    }

    public int getRightPaddleHeight() {
        return rightPaddleHeight;
    }

    public void setRightPaddleHeight(int rightPaddleHeight) {
        this.rightPaddleHeight = rightPaddleHeight;
    }

    public int getRightPaddleWidth() {
        return rightPaddleWidth;
    }

    public void setRightPaddleWidth(int rightPaddleWidth) {
        this.rightPaddleWidth = rightPaddleWidth;
    }
}