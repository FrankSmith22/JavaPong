package Model;

public class LeftPaddleData {
    private int x; // This represents the left paddle's top left x coord value
    private int y; // And so on..
    private int width;
    private int height;
    

    public LeftPaddleData(){
        this(50, 200, 20, 150); // TODO Adjust using getHeight method of FieldPanel
    }

    public LeftPaddleData(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}