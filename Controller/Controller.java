package Controller;

import View.View;

import Model.*;

public class Controller {
    Model model;
    LeftPaddle leftPaddle; // Refs for efficient access
    RightPaddle rightPaddle;
    Ball ball;

    View view;
    public Controller(Model model, View view){
        // Init Model
        this.model = model;
        this.leftPaddle = model.getLeftPaddle();
        this.rightPaddle = model.getRightPaddle();
        this.ball = model.getBall();

        // Init view
        this.view = view;

        // Assign listeners to paddles and ball

        while(!model.getScore().getGameOver()){
            // Game is running
            // Repainting, checking collisions, etc.
        }

        // COLLISION DETECTION FUNCTIONS:
    }
}