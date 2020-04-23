package View;

import java.awt.Color;
import java.awt.Graphics;

public class LeftPaddleComponent{
    private int leftPaddleX = 50; // Pixels away from wall
    private int leftPaddleY = 200; // Pixels away from ceiling
    private int leftPaddleWidth = 20;
    private int leftPaddleHeight = 150;

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.drawRect(leftPaddleX, leftPaddleY, leftPaddleWidth, leftPaddleHeight);
        g.fillRect(leftPaddleX, leftPaddleY, leftPaddleWidth, leftPaddleHeight);
    }

    public int getLeftPaddleX() {
        return leftPaddleX;
    }

    public void setLeftPaddleX(int leftPaddleX){
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