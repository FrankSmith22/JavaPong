package Controller;

import View.View;

import Model.Model;

public class Controller {
    Model model;
    View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        while(!model.getScore().getGameOver()){
            // Game is running
            
            // Init Model
            // Init view
            // Assign listeners to paddles and ball

        }
    }
}