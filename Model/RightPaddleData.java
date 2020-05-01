package Model;
/***************************************
* Filename: RightPaddleData.java
* Short description: This class describes the data of the right paddle
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
public class RightPaddleData {
    private int x;
    private int y;
    private int width;
    private int height;

    public RightPaddleData(){
        this(950, 200, 20, 150); // TODO Adjust using getHeight method of FieldPanel
    }

    public RightPaddleData(int x, int y, int width, int height) {
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