package View;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;

public class RightPaddleComponent{
    private int rightPaddleX = 950;
    private int rightPaddleY = 200;
    private int rightPaddleWidth = 20; 
    private int rightPaddleHeight = 150;

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.drawRect(rightPaddleX, rightPaddleY,
            rightPaddleWidth, rightPaddleHeight);
        g.fillRect(rightPaddleX, rightPaddleY,
            rightPaddleWidth, rightPaddleHeight);
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

    public int getRightPaddleWidth() {
        return rightPaddleWidth;
    }

    public void setRightPaddleWidth(int rightPaddleWidth) {
        this.rightPaddleWidth = rightPaddleWidth;
    }

    public int getRightPaddleHeight() {
        return rightPaddleHeight;
    }

    public void setRightPaddleHeight(int rightPaddleHeight) {
        this.rightPaddleHeight = rightPaddleHeight;
    }
}