package Controller;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

import Model.*;
import View.*;

public class Controller implements KeyListener {
    Model model;
    LeftPaddleData leftPaddleData; // Refs for efficient access
    RightPaddleData rightPaddleData;
    BallData ballData;
    int gameOver;

    View view;
    LeftPaddleComponent leftPaddleComponent;
    RightPaddleComponent rightPaddleComponent;
    BallComponent ballComponent;

    TimerTask timerTask;
    Timer timer;

    public Controller(Model model, View view) {
        // Init Model
        this.model = model;
        this.leftPaddleData = model.getLeftPaddle();
        this.rightPaddleData = model.getRightPaddle();
        this.ballData = model.getBall();

        // Init view
        this.view = view;
        this.leftPaddleComponent = view.getFP().getFieldComponents().getLeftPaddleComponent();
        this.rightPaddleComponent = view.getFP().getFieldComponents().getRightPaddleComponent();
        this.ballComponent = view.getFP().getFieldComponents().getBallComponent();

        // Assign listeners to paddles
        view.getIF().addKeyListener(this);

        // Run the game!
        timerTask = new GameTimer();
        timer = new Timer(true);
        timer.schedule(timerTask, 1000, 17);
        // Add gameover condition check here, and cancel timer
    }

    // Inner class because it's very small
    // =================================================================
    public class GameTimer extends TimerTask {
        @Override
        public void run() {
            runGame();
        }
    }
    // =================================================================

    public void runGame() {
        // Game is running
        gameOver = model.getScore().getGameOver();
        if(gameOver == 0){
            checkCollision();
            moveBall();
            view.getFP().getFieldComponents().repaint();
        }
        else{
            System.out.println("Game over!");
            view.getSP().getP1().setText("Game over, Player " + gameOver + " Won!");
            view.getSP().getP2().setText("Game over, Player " + gameOver + " Won!");
            if(gameOver == 1){
                view.getSP().getP1().setBackground(Color.GREEN);
                view.getSP().getP2().setBackground(Color.RED);
            }
            else{
                view.getSP().getP1().setBackground(Color.RED);
                view.getSP().getP2().setBackground(Color.GREEN);
            }
            ballData.setX(495);
            ballData.setY(275);
            timer.cancel();
        }
    }

    public void moveBall() {
        // Update Model
        ballData.setX(ballData.getX() + ballData.getDirX());
        ballData.setY(ballData.getY() + ballData.getDirY());

        // Update View
        ballComponent.setX(ballData.getX());
        ballComponent.setY(ballData.getY());
    }

    public void checkCollision() {

        // check if ball hits floor...
        if (ballData.getY() >= 600) {
            ballData.setDirY(-(ballData.getDirY()));
        }

        // check if ball hits ceiling...
        if (ballData.getY() <= 0) {
            ballData.setDirY(-(ballData.getDirY()));
        }

        // check if ball hits leftPaddle
        if ((ballData.getX() <= leftPaddleData.getX() + leftPaddleData.getWidth())
                && (ballData.getY() >= leftPaddleData.getY())
                && (ballData.getY() <= leftPaddleData.getY() + leftPaddleData.getHeight())) {
            ballData.setDirX(-ballData.getDirX());
        }

        // check if ball hits rightPaddle
        if ((ballData.getX() + ballData.getWidth() >= rightPaddleData.getX())
                && (ballData.getY() >= rightPaddleData.getY())
                && (ballData.getY() <= rightPaddleData.getY() + rightPaddleData.getHeight())) {
            ballData.setDirX(-ballData.getDirX());
        }

        // Check if ball hits left wall
        if (ballData.getX() <= 0) {
            ballData.setX(495);
            ballData.setY(275);
            model.getScore().incPlayerTwoScore();
            view.getSP().getP2().setText( Integer.toString(model.getScore().getPlayerTwoScore()) );                                        
        }

        // Check if ball hits right wall
        // If true, reset ball position
        // Give player one one point
        // Update the score button text with new score
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        //87 w 83 s 40 downarrow 38 uparrow
        if(key == 40) {
            rightPaddleData.setY(rightPaddleData.getY() + 15);
            rightPaddleComponent.setY(rightPaddleData.getY());
            view.getFP().getFieldComponents().repaint();
        }

        if(key == 38) {
            rightPaddleData.setY(rightPaddleData.getY() - 15);
            rightPaddleComponent.setY(rightPaddleData.getY());
            view.getFP().getFieldComponents().repaint();
        }

        if(key == 83) {
            leftPaddleData.setY(leftPaddleData.getY() + 15);
            leftPaddleComponent.setY(leftPaddleData.getY());
            view.getFP().getFieldComponents().repaint();
        }

        if(key == 87) {
            leftPaddleData.setY(leftPaddleData.getY() - 15);
            leftPaddleComponent.setY(leftPaddleData.getY());
            view.getFP().getFieldComponents().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }
}