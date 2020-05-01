/**
 * Inter OO App Dev Final Project: Java Pong
 * File name: App.java
 * Short description: Entry point for application
 * 
 * @author Frank Smith, Honghao Wei, Luthfi Mohammed, and Hunter Jones
 * @version 4/30/2020
 */
import View.View;

import Controller.Controller;
import Model.Model;

public class App {
    public static void main(String[] args){
        new Controller(new Model(), new View());
    }
}