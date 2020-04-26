package Controller;

import java.util.Timer;
import java.util.TimerTask;

import Model.*;
import View.*;

public class Controller{
    Model model;
    LeftPaddleData leftPaddleData; // Refs for efficient access
    RightPaddleData rightPaddleData;
    BallData ballData;

    View view;
    LeftPaddleComponent leftPaddleComponent;
    RightPaddleComponent rightPaddleComponent;
    BallComponent ballComponent;

    TimerTask timerTask;
    Timer timer;

    public Controller(Model model, View view){
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



        // Run the game!
        timerTask = new GameTimer();
        timer = new Timer(true);
        timer.schedule(timerTask, 1000, 17);
        //Add gameover condition check here, and cancel timer
    }

//Inner class because it's very small
//=================================================================
        public class GameTimer extends TimerTask{
            @Override
            public void run() {
                runGame();
            }
        }
//=================================================================

    public void runGame(){
            // Game is running
            checkCollision();
            moveBall();

            view.getFP().getFieldComponents().repaint();
    }

    public void moveBall(){
        // Update Model
        ballData.setX(ballData.getX() + ballData.getDirX());
        ballData.setY(ballData.getY() + ballData.getDirY());
        

        // Update View
        ballComponent.setX(ballData.getX());
        ballComponent.setY(ballData.getY());
    }

    public void checkCollision(){

        // check if ball hits floor...
        if(ballData.getY() >= 600){
            ballData.setDirY(-(ballData.getDirY()));
        }

        //check if ball hits ceiling...
        if(ballData.getY() <= 0){
            ballData.setDirY(-(ballData.getDirY()));
        }

        //check if ball hits leftPaddle
        if( (ballData.getX() <= leftPaddleData.getX() + leftPaddleData.getWidth()) && (ballData.getY() >= leftPaddleData.getY()) && (ballData.getY() <= leftPaddleData.getY() + leftPaddleData.getHeight()) ){
            ballData.setDirX(-ballData.getDirX());
        }

        //check if ball hits rightPaddle
        if( (ballData.getX() + ballData.getWidth() >= rightPaddleData.getX()) && (ballData.getY() >= rightPaddleData.getY()) && (ballData.getY() <= rightPaddleData.getY() + rightPaddleData.getHeight()) ){
            ballData.setDirX(-ballData.getDirX());
        }

        //check if ball hits left wall

        //check if ball hits right wall

    }
}