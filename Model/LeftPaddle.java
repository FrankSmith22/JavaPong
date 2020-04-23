package Model;

public class LeftPaddle {
    int leftPaddleX; // This represents the left paddle's top left x coord value
    int leftPaddleY; // And so on..
    int leftPaddleHeight;
    int leftPaddleWidth;

    public LeftPaddle(){
        this(10, 650, 100, 20); // TODO Adjust using getHeight method of FieldPanel
    }

    public LeftPaddle(int leftPaddleX, int leftPaddleY, int leftPaddleHeight, int leftPaddleWidth) {
        this.leftPaddleX = leftPaddleX;
        this.leftPaddleY = leftPaddleY;
        this.leftPaddleHeight = leftPaddleHeight;
        this.leftPaddleWidth = leftPaddleWidth;
    }

    public int getLeftPaddleX() {
        return leftPaddleX;
    }

    public void setLeftPaddleX(int leftPaddleX) {
        this.leftPaddleX = leftPaddleX;
    }

    public int getLeftPaddleY() {
        return leftPaddleY;
    }

    public void setLeftPaddleY(int leftPaddleY) {
        this.leftPaddleY = leftPaddleY;
    }

    public int getLeftPaddleHeight() {
        return leftPaddleHeight;
    }

    public void setLeftPaddleHeight(int leftPaddleHeight) {
        this.leftPaddleHeight = leftPaddleHeight;
    }

    public int getLeftPaddleWidth() {
        return leftPaddleWidth;
    }

    public void setLeftPaddleWidth(int leftPaddleWidth) {
        this.leftPaddleWidth = leftPaddleWidth;
    }
}