package Controller;

import View.View;

import Model.Model;

public class Controller {
    public Controller(Model model, View view){
        model = new Model();
        view = new View();
        while(!model.getScore().getGameOver()){
            // Game is running
            
            // Init Model
            // Init view
            // Assign listeners to paddles and ball

        }
    }
}