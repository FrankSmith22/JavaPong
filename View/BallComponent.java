package View;
/***************************************
* Filename: BallComponent.java
* Short description: This class describes the components of the ball
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import java.awt.Color;
import java.awt.Graphics;

public class BallComponent{
    private int x;
    private int y;
    private int width;
    private int height;

    public BallComponent(){
        this(495, 275, 25, 25);
    }

    public BallComponent(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
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