import View.View;

import Controller.Controller;
import Model.Model;

public class App {
    public static void main(String[] args){
        new Controller(new Model(), new View());
    }
}