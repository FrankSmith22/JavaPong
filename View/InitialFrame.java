package View;
/***************************************
* Filename: InitialFrame.java
* Short description: This class has the access to initial panel
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import javax.swing.JFrame;

public class InitialFrame extends JFrame {
    private InitialPanel iP;
    private StartPanel startPanel;

    public InitialFrame(){
        super("Java Pong!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,700);
        setVisible(true);

        iP = new InitialPanel();
        startPanel = new StartPanel();
        add(startPanel);
    }

    public InitialPanel getiP() {
        return iP;
    }

    public StartPanel getStartPanel(){
        return startPanel;
    }
}