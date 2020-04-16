package View;

import javax.swing.JFrame;

public class InitialFrame extends JFrame {
    InitialPanel iP;

    public InitialFrame(){
        super("Java Pong!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,500);
        setVisible(true);

        iP = new InitialPanel();
        add(iP);
    }

    public InitialPanel getiP() {
        return iP;
    }
}