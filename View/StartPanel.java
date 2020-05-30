package View;

/***************************************
* Filename: StartPanel.java
* Short description: Start page that initially appears before game
* @author Frank Smith
* @version  5/29/20
***************************************/
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.net.URL;

public class StartPanel extends JPanel {
    private JButton startButton;

    public StartPanel(){
        setLayout(new BorderLayout());
        startButton = new JButton("Start!");
        startButton.setFocusable(false); //Required to ensure keylistener doesnt lose focus on the frame
        add(startButton, "South");

        
        JLabel imgLabel = new JLabel(new ImageIcon("View\\titleScreen.png"));
        add(imgLabel, "Center");
    }

    public JButton getStartButton(){
        return startButton;
    }
}