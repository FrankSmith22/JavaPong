package Controller;

/***************************************
* Filename: Controller.java
* Short description: This class handles collision checking, running the timer, and mediates between View and Model
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Model.*;
import View.*;

public class Controller implements KeyListener{
    private Model model;
    private LeftPaddleData leftPaddleData; // Refs for efficient access
    private RightPaddleData rightPaddleData;
    private BallData ballData;
    private int gameOver;

    private View view;
    private LeftPaddleComponent leftPaddleComponent;
    private RightPaddleComponent rightPaddleComponent;
    private BallComponent ballComponent;

    private TimerTask timerTask;
    private Timer timer;

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

        view.getIF().repaint();
        view.getIF().revalidate();

        // attach keyboard listener
        view.getIF().addKeyListener(this);

        view.getStartPanel().getStartButton().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
                view.getIF().remove(view.getStartPanel());
                view.getIF().add(view.getIP());
                view.getIF().repaint();
                view.getIF().revalidate();

                

                // Run the game!
                timerTask = new GameTimer();
                timer = new Timer(true);
                timer.schedule(timerTask, 1000, 17);
			}
        });
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
        switch(gameOver){
            //If zero, no one has won yet
            case 0: checkCollision();
                    moveBall();
                    view.getFP().getFieldComponents().repaint();
                    break;
            // If 1, player one has won
            case 1: System.out.println("Game over!");
                    view.getSP().getP1().setText("Game over, Player " + gameOver + " Won!");
                    view.getSP().getP2().setText("Game over, Player " + gameOver + " Won!");
                    view.getSP().getP1().setBackground(Color.GREEN);
                    view.getSP().getP2().setBackground(Color.RED);
                    ballData.setX(495);
                    ballData.setY(275);
                    timer.cancel();
                    break;
            // If 2, player two has won
            case 2: System.out.println("Game over!");
                    view.getSP().getP1().setText("Game over, Player " + gameOver + " Won!");
                    view.getSP().getP2().setText("Game over, Player " + gameOver + " Won!");
                    view.getSP().getP1().setBackground(Color.RED);
                    view.getSP().getP2().setBackground(Color.GREEN);
                    ballData.setX(495);
                    ballData.setY(275);
                    timer.cancel();
                    break;
            default: System.out.println("This is an invalid gameOver value.. stopping the game");
                    ballData.setX(495);
                    ballData.setY(275);
                    timer.cancel();
                    break;
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
         if (ballData.getX() >= 1000) {
            ballData.setX(495);
            ballData.setY(275);
            model.getScore().incPlayerOneScore();
            view.getSP().getP1().setText( Integer.toString(model.getScore().getPlayerOneScore()) );                                        
        }
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
            //Check for right paddle collision with floor, move if not
            if (!((rightPaddleData.getY() + rightPaddleData.getHeight()) >= 600)){
                rightPaddleData.setY(rightPaddleData.getY() + 15);
                rightPaddleComponent.setY(rightPaddleData.getY());
                view.getFP().getFieldComponents().repaint();
            }
        }

        if(key == 38) {
            //Check for right paddle collision with ceiling, move if not
            if(!(rightPaddleData.getY() <= 0)){
                rightPaddleData.setY(rightPaddleData.getY() - 15);
                rightPaddleComponent.setY(rightPaddleData.getY());
                view.getFP().getFieldComponents().repaint();
            }
        }

        if(key == 83) {
            //Check for left paddle collision with floor, move if not
            if (!((leftPaddleData.getY() + rightPaddleData.getHeight()) >= 600)){
                leftPaddleData.setY(leftPaddleData.getY() + 15);
                leftPaddleComponent.setY(leftPaddleData.getY());
                view.getFP().getFieldComponents().repaint();
            }
        }

        if(key == 87) {
            //Check for left paddle collision with ceiling, move if not
            if(!(leftPaddleData.getY() <= 0)){
                leftPaddleData.setY(leftPaddleData.getY() - 15);
                leftPaddleComponent.setY(leftPaddleData.getY());
                view.getFP().getFieldComponents().repaint();
            }
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }
}