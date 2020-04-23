package Controller;

import View.View;

import Model.*;

public class Controller {
    Model model;
    LeftPaddleData leftPaddleData; // Refs for efficient access
    RightPaddleData rightPaddleData;
    BallData ballData;

    View view;
    public Controller(Model model, View view){
        // Init Model
        this.model = model;
        this.leftPaddleData = model.getLeftPaddle();
        this.rightPaddleData = model.getRightPaddle();
        this.ballData = model.getBall();

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