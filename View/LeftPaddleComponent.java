package View;
/***************************************
* Filename: LeftPaddleComponent.java
* Short description: This class left paddle's component
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import java.awt.Color;
import java.awt.Graphics;

public class LeftPaddleComponent{
    private int x = 50; // Pixels away from wall
    private int y = 200; // Pixels away from ceiling
    private int width = 20;
    private int height = 150;

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
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