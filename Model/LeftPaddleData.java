package Model;

public class LeftPaddleData {
    private int leftPaddleX; // This represents the left paddle's top left x coord value
    private int leftPaddleY; // And so on..
    private int leftPaddleWidth;
    private int leftPaddleHeight;
    

    public LeftPaddleData(){
        this(50, 200, 20, 150); // TODO Adjust using getHeight method of FieldPanel
    }

    public LeftPaddleData(int leftPaddleX, int leftPaddleY, int leftPaddleWidth, int leftPaddleHeight) {
        this.leftPaddleX = leftPaddleX;
        this.leftPaddleY = leftPaddleY;
        this.leftPaddleWidth = leftPaddleWidth;
        this.leftPaddleHeight = leftPaddleHeight;
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