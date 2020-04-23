package Model;

public class RightPaddleData {
    private int rightPaddleX;
    private int rightPaddleY;
    private int rightPaddleWidth;
    private int rightPaddleHeight;

    public RightPaddleData(){
        this(950, 200, 20, 150); // TODO Adjust using getHeight method of FieldPanel
    }

    public RightPaddleData(int rightPaddleX, int rightPaddleY, int rightPaddleWidth, int rightPaddleHeight) {
        this.rightPaddleX = rightPaddleX;
        this.rightPaddleY = rightPaddleY;
        this.rightPaddleWidth = rightPaddleWidth;
        this.rightPaddleHeight = rightPaddleHeight;
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